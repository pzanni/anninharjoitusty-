
import java.sql.SQLException;


public class KenkaDao {
    private final Database database;
    private MalliDao mallidao;
    
    public KenkaDao(Database database) {
        this.database = database;
    }
    
    public void initDaos(MalliDao mallidao) {
        this.mallidao = mallidao;
    }
    
    public Kenka findOne(int kenkaid) throws SQLException{
        
    }
}
