/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import JFG_Controller.MysqlConnect;
import JFG_Models.ModelEmpleado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




/**
 * FXML Controller class
 *
 * @author jhoda
 */
public class JFG_LogginFXMLController implements Initializable {
    
    MysqlConnect cn = new MysqlConnect();
    ModelEmpleado Emp;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    
    private Label theLabel;
    @FXML
    private TextField TxtUsuario;
    @FXML
    private TextField TxtContraseña;
    @FXML
    private Button BtIngresar;
    @FXML
    private Button BtRegistrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BtnIngresarAction(ActionEvent event) {
        con = cn.Conexion();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from jfg_empleados where emp_usuario = '"+TxtUsuario.getText()+"'");
            
            Emp.setEmp_Usuario(rs.getString("Emp_Usuario"));
            Emp.setPer_Id(Integer.parseInt(rs.getString("Per_Id")));
            Emp.setCar_Id(Integer.parseInt(rs.getString("Car_Id")));
            Emp.setEmp_FechaContrato(rs.getString("Emp_FechaContrato"));
            Emp.setEmp_FechaSalida(rs.getString("Emp_FechaSalida"));
            Emp.setCont_Id(rs.getString("Cont_Id"));
            
            rs = stmt.executeQuery("select * from jfg_contraseñas where Cont_Id = '"+Emp.getCont_Id()+"'");
            
            Emp.setCont_Contraseña(rs.getString(rs.getString("Cont_Contraseña")));
            
            JOptionPane.showMessageDialog(null, "Sesión iniciada.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró su usuario.");
            Logger.getLogger(JFG_LogginFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
