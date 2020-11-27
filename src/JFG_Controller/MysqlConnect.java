
package JFG_Controller;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JFG
 */
public class MysqlConnect {
    
    public static void main(String[] arg){
        
        String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/jfgdb";
        Connection con;
        Statement stmt;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(url,usuario,clave);
            stmt = con.createStatement();
            stmt.executeUpdate("insert into jfg_cargo values(2,'Cajero',1060000)");
            rs = stmt.executeQuery("select * from jfg_cargo");
            rs.next();
            do {                
                System.out.println(rs.getString("Car_Id")+" Cargo: "+rs.getString("Car_Cargo")+" Salario: "+rs.getString("Car_Salario"));
            } while (rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
