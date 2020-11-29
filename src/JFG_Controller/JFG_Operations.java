
package JFG_Controller;

import JFG_Controller.MysqlConnect;
import java.sql.*;

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
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
        } catch (Exception e) {
        }
        return rs;
    }
}
