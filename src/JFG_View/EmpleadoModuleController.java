/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_View;

import JFG_Controller.MysqlConnect;
import JFG_Models.ModelEmpleado;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author jhoda
 */
public class EmpleadoModuleController implements Initializable {
    
    MysqlConnect cn = new MysqlConnect();
    ModelEmpleado Emp;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    @FXML
    private TextField txt_dni;
    @FXML
    private Button bt_buscar;
    @FXML
    private TextField txt_nombres;
    @FXML
    private TextField txt_apellidos;
    @FXML
    private TextField txt_correo;
    @FXML
    private TextField txt_id;
    @FXML
    private DatePicker date_fechainicio;
    @FXML
    private DatePicker date_fechafin;
    @FXML
    private TextField txt_usuario;
    @FXML
    private TextField txt_contraseña;
    @FXML
    private Button bt_registrar;
    @FXML
    private TableColumn<?, ?> tb_id;
    @FXML
    private TableColumn<?, ?> tb_dni;
    @FXML
    private TableColumn<?, ?> tb_nombres;
    @FXML
    private TableColumn<?, ?> tb_apellidos;
    @FXML
    private TableColumn<?, ?> tb_correo;
    @FXML
    private TableColumn<?, ?> tb_cargo;
    @FXML
    private ComboBox<?> cbx_cargo;
    @FXML
    private TableColumn<?, ?> tb_estado;
    @FXML
    private ComboBox<?> cbx_estado;
    @FXML
    private ComboBox<?> cbx_tipodocumento;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void RegistrarEmpleadoAction(ActionEvent event) {
      /*  
        try {
            con = cn.Conexion();
            stmt = con.createStatement();
            stmt.executeUpdate("insert into jfg_personas values(null,'"+txt_dni.getText()+
                    "','"+txt_nombres.getText()+
                    "','"+txt_nombres.getText()+
                    "','"+txt_nombres.getText());
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            txt_dni.setText("");
            txt_nombres.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

   
        Listar();
*/
    }
 
}
