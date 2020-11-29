
package JFG_Controller;

import JFG_Controller.MysqlConnect;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhoda
 */
public class JFG_Operations {
    
    MysqlConnect con = new MysqlConnect();
    Connection cn;
    Statement stmt;
    ResultSet rs;
    
    public ResultSet ListarCargos(String sql){
        
        try {
            cn = con.Conexion();
            stmt = cn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
        }
        return rs;
    }
    
    public void InsertCargos(String sql){
        try {
            stmt = cn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
