
import java.sql.Connection;
import java.sql.DriverManager;


public class Main {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:kenkakauppa.db");
        
    }
}
