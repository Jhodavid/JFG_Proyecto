
package JFG_Controller;

import JFG_Controller.MysqlConnect;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jhoda
 */
public class JFG_Operations {
    
    MysqlConnect con = new MysqlConnect();
    Connection cn;
    Statement st;
    ResultSet rs;
    
    public ResultSet ListarCargos(String sql){
        
        try {
            cn = con.Conexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
        } catch (Exception e) {
        }
        return rs;
    }
    
    public void InsertCargos(String sql){
        try {
            cn = con.Conexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
        } catch (Exception e) {
        }
    }
}
