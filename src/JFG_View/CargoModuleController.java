/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import JFG_Controller.JFG_Operations;
import javafx.event.ActionEvent;
import JFG_Controller.MysqlConnect;
import JFG_Models.ModelCargo;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author jhoda
 */
public class CargoModuleController implements Initializable {

    JFG_Operations op = new JFG_Operations();
    String usuario = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/jfgdb";
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    @FXML
    private TextField txt_id;
    @FXML
    private TextField txt_nombre;
    @FXML
    private Button bt_registrar;
    @FXML
    private TableView<ModelCargo> CargoTable;
    @FXML
    private TableColumn<ModelCargo, Integer> tb_id;
    @FXML
    private TableColumn<ModelCargo, String> tb_nombre;
    @FXML
    private TableColumn<ModelCargo, Double> tb_salario;
    @FXML
    private TextField txt_salario;
    @FXML
    private Button bt_modificar;
    
    
    public void Listar(){
        
        ObservableList<ModelCargo> cargoList = FXCollections.observableArrayList();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(this.url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from jfg_cargo");
            
            while(rs.next()){
                cargoList.add(new ModelCargo(Integer.parseInt(rs.getString("Car_Id")),rs.getString("Car_Cargo"),Double.parseDouble(rs.getString("Car_Salario"))));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            tb_id.setCellValueFactory(new PropertyValueFactory<>("Car_Id"));
            tb_nombre.setCellValueFactory(new PropertyValueFactory<>("Car_Cargo"));
            tb_salario.setCellValueFactory(new PropertyValueFactory<>("Car_Salario"));
            
            CargoTable.setItems(cargoList);
    }
    


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Listar();
    }

    @FXML
    private void bt_registrarAction(ActionEvent event) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            stmt.executeUpdate("insert into jfg_cargo values(null,'" + txt_nombre.getText() + "'," + txt_salario.getText() + ")");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            txt_nombre.setText("");
            txt_salario.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        Listar();
    }
}
