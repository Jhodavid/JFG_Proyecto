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
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
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
    PreparedStatement pst = null;

    int index = -1;

    @FXML
    private TextField txt_id;
    @FXML
    private TextField txt_nombre;
    @FXML
    private Button bt_registrar;
    @FXML
    private TableView<ModelCargo> CargoTable;
    @FXML
    private TableColumn<ModelCargo, String> tb_id;
    @FXML
    private TableColumn<ModelCargo, String> tb_nombre;
    @FXML
    private TableColumn<ModelCargo, String> tb_salario;
    @FXML
    private TextField txt_salario;
    @FXML
    private Button bt_modificar;
    @FXML
    private Button bt_eliminar;
    @FXML
    private Button bt_nuevo;

    //--
    //Metodo para listar en la tabla
    public void Listar() {

        ObservableList<ModelCargo> cargoList = FXCollections.observableArrayList();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from jfg_cargo");

            while (rs.next()) {
                cargoList.add(new ModelCargo(rs.getString("Car_Id"), rs.getString("Car_Cargo"), rs.getString("Car_Salario")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        tb_id.setCellValueFactory(new PropertyValueFactory<>("Car_Id"));
        tb_nombre.setCellValueFactory(new PropertyValueFactory<>("Car_Cargo"));
        tb_salario.setCellValueFactory(new PropertyValueFactory<>("Car_Salario"));

        CargoTable.setItems(cargoList);
    }
    
    public void Nuevo(){
            txt_id.setText("");
            txt_nombre.setText("");
            txt_salario.setText("");
            index = -1;
    }

    //Metodo para objeto seleccionado
    @FXML
    private void getSelectedMouse(javafx.scene.input.MouseEvent event) {
        index = CargoTable.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        txt_id.setText(tb_id.getCellData(index));
        txt_nombre.setText(tb_nombre.getCellData(index));
        txt_salario.setText(tb_salario.getCellData(index));
    }

    //--
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txt_id.setEditable(false);
        Listar();
    }

    @FXML
    private void bt_registrarAction(ActionEvent event) {

        try {
            stmt = con.createStatement();
            stmt.executeUpdate("insert into jfg_cargo values(null,'" + txt_nombre.getText() + "'," + txt_salario.getText() + ")");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            Nuevo();
            index = -1;
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        Listar();
    }

    @FXML
    private void Edit(ActionEvent event) {

        if (index == -1) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debe seleccionar un cargo");
            alert.showAndWait();
        } else {
            try {
                stmt = con.createStatement();
                stmt.executeUpdate("update jfg_cargo set car_id = "+txt_id.getText()+","+"car_cargo = '"+
                        txt_nombre.getText()+"',car_salario = "+txt_salario.getText()+" where car_id = "+txt_id.getText());
                Nuevo();
                Listar();
                index = -1;
            } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void Deleted(ActionEvent event) {
        
        if (index == -1) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debe seleccionar un cargo");
            alert.showAndWait();
        } else {
            try {
                stmt = con.createStatement();
                stmt.executeUpdate("delete from jfg_cargo where car_id = "+txt_id.getText());
                Nuevo();
                Listar();
                index = -1;
            } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void bt_nuevoAction(ActionEvent event) {
        Nuevo();
    }
    
    

}
