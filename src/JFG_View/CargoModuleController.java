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
import java.sql.*;
import javafx.event.ActionEvent;

/**
 * FXML Controller class
 *
 * @author jhoda
 */
public class CargoModuleController implements Initializable {
    
    JFG_Operations op = new JFG_Operations();
    
    @FXML
    private TextField txt_id;
    @FXML
    private TextField txt_nombre;
    @FXML
    private Button bt_registrar;
    @FXML
    private TableColumn<?, ?> tb_id;
    @FXML
    private TableColumn<?, ?> tb_nombre;
    @FXML
    private TableColumn<?, ?> tb_salario;
    @FXML
    private TextField txt_salario;
    @FXML
    private Button bt_modificar;
    @FXML
    private TableView<ResultSet> CargoTable;
    @FXML
    private TextField txt_id1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
   
}
