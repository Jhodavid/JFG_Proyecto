
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
    
    public String Cifrado(String pass) {
        char Array[] = pass.toCharArray();
        int N = Array.length;
        int C = N;
        for (int i = 0; i < N; i++) {
            Array[i] = (char) (Array[i] + (char) C);
            C--;
        }
        for (int i = 0; i < N - 1; i++) {

            char aux = Array[i];
            Array[i] = Array[i + 1];
            Array[i + 1] = aux;
        }
        for (int i = 0; i < N; i++) {

            Array[i] = (char) (Array[i] + (char) i);
        }
        for (int i = 0; i < N - 1; i++) {

            char aux = Array[i];
            Array[i] = Array[i + 1];
            Array[i + 1] = aux;
        }//2
        
        
        for (int i = 0; i < N; i++) {
            int k = 1 - i + 4;
            Array[i] = (char) (Array[i] + (char) i + k);
        }
        for (int i = 0; i < N - 1; i++) {

            char aux = Array[i];
            Array[i] = Array[N - i - 1];
            Array[N - i - 1] = aux;
        }
        String Encriptado = String.valueOf(Array);
        System.out.println(Encriptado);
        return Encriptado;
    }

    public String Decifrado(String Encriptado) {
        char array[] = Encriptado.toCharArray();
        int N = array.length;
        int D = N;
        for (int i = 0; i < N - 1.; i++) {
            char aux = array[i];
            array[i] = array[N - i - 1];
            array[N - i - 1] = aux;
        }
        for (int i = 0; i < N; i++) {
            int k = 1 - i + 4;
            array[i] = (char) (array[i] - ((char) (i + k)));
        }
        for (int i = N - 1; i > 0; i--) {

            char aux = array[i];
            array[i] = array[i - 1];
            array[i - 1] = aux;
        }
        for (int i = 0; i < N; i++) {

            array[i] = (char) (array[i] - (char) i);
        }
        
        
        for (int i = N - 1; i > 0; i--) {

            char aux = array[i];
            array[i] = array[i - 1];
            array[i - 1] = aux;
        }
        for (int i = 0; i < N; i++) {
            array[i] = (char) (array[i] - (char) D);
            D--;
        }
        String Dcifrado = String.valueOf(array);
        System.out.println(Dcifrado);
        return Dcifrado;
    }
}
