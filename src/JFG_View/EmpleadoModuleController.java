/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_View;

import JFG_Controller.JFG_Operations;
import JFG_Controller.MysqlConnect;
import JFG_Models.ModelCargo;
import JFG_Models.ModelEmpleado;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author jhoda
 */
public class EmpleadoModuleController implements Initializable {
    
    JFG_Operations op = new JFG_Operations();
    String usuario = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/jfgdb";
    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst = null;

    int index = -1;
    
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
    private TableColumn<ModelEmpleado, String> tb_id;
    @FXML
    private TableColumn<ModelEmpleado, String> tb_dni;
    @FXML
    private TableColumn<ModelEmpleado, String> tb_nombres;
    @FXML
    private TableColumn<ModelEmpleado, String> tb_apellidos;
    @FXML
    private TableColumn<ModelEmpleado, String> tb_correo;
    @FXML
    private TableColumn<ModelEmpleado, String> tb_cargo;
    @FXML
    private ComboBox<?> cbx_cargo;
    @FXML
    private TableColumn<ModelEmpleado, String> tb_estado;
    @FXML
    private ComboBox<?> cbx_estado;
    @FXML
    private TableView<ModelEmpleado> tablaEmpleado;
    
    
    public void Listar() {

        ObservableList<ModelEmpleado> empleadoList = FXCollections.observableArrayList();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from jfg_empleado");

            while (rs.next()) {
                empleadoList.add(new ModelEmpleado(rs.getString("Emp.Usuario"), rs.getString("Per_Id"), rs.getString("Car_Id"),rs.getString("Emp_FechaContrato"), rs.getString("Emp_FechaSalida")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        tb_id.setCellValueFactory(new PropertyValueFactory<>("Car_Id"));
        tb_dni.setCellValueFactory(new PropertyValueFactory<>("Car_Cargo"));
        tb_nombres.setCellValueFactory(new PropertyValueFactory<>("Car_Salario"));
        tb_apellidos.setCellValueFactory(new PropertyValueFactory<>("Car_Id"));
        tb_correo.setCellValueFactory(new PropertyValueFactory<>("Car_Cargo"));
        tb_cargo.setCellValueFactory(new PropertyValueFactory<>("Car_Salario"));
        tb_estado.setCellValueFactory(new PropertyValueFactory<>("Car_Salario"));

        tablaEmpleado.setItems(empleadoList);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Buscar(ActionEvent event) {
    }

    @FXML
    private void Registrar(ActionEvent event) {
    }

    @FXML
    private void Actualizar(ActionEvent event) {
    }
    
}
