
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Database {

    private final Connection connection;
    private final RowSetFactory factory;
    private boolean debug;

    public Database(String address) throws Exception {
        this.connection = DriverManager.getConnection(address);
        this.factory = RowSetProvider.newFactory();
    }

    public void setDebugMode(boolean d) {
        debug = d;
    }

    private PreparedStatement prepareStatement(String query, Object... params) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(query);

        int i = 1;
        for (Object object : params) {
            if (object instanceof Collection) {
                for (Object obj : (Collection) object) {
                    stmt.setObject(i++, obj);
                }
            } else {
                stmt.setObject(i++, object);
            }
        }

        return stmt;
    }

    public CachedRowSet query(String query, Object... params) throws SQLException {
        if (debug) {
            System.out.println("---");
            System.out.println("Executing: " + query);
            System.out.println("---");
        }

        CachedRowSet crs = factory.createCachedRowSet();

        try (PreparedStatement stmt = prepareStatement(query, params)) {
            ResultSet rs = stmt.executeQuery();
            crs.populate(rs);
        }

        return crs;
    }


    public int update(String updateQuery, Object... params) throws SQLException {
        int changes;
        try (PreparedStatement stmt = prepareStatement(updateQuery, params)) {
            changes = stmt.executeUpdate();

            if (debug) {
                System.out.println("---");
                System.out.println(updateQuery);
                System.out.println("Changed rows: " + changes);
                System.out.println("---");
            }
        }

        return changes;
    }

    private void debug(ResultSet rs) throws SQLException {
        int columns = rs.getMetaData().getColumnCount();
        for (int i = 0; i < columns; i++) {
            System.out.print(rs.getObject(i + 1) + ":"
                    + rs.getMetaData().getColumnName(i + 1) + "  ");
        }

        System.out.println();
    }
}
