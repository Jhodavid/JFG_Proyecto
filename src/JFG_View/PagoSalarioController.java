/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_View;

import JFG_Controller.JFG_Operations;
import JFG_Controller.MysqlConnect;
import JFG_Models.ModelSalario;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author FRANKLIN
 */
public class PagoSalarioController implements Initializable {
    
    JFG_Operations op = new JFG_Operations();
    String usuario = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/jfgdb";
    Connection con;
    Statement stmt;
    ResultSet rs;

    int index = -1;
    
    @FXML
    private Button BtEliminarSalario;
    @FXML
    private Button BtLimpiarSalario;
    @FXML
    private Button BtModificarSalario;
    @FXML
    private Button BtRegistrarSalario;
    @FXML
    private TextField TxtIdEmpleadoSalario;
    @FXML
    private TextField TxtMontoSalario;
    @FXML
    private DatePicker TxtFechaSalario;
    @FXML
    private TableView<ModelSalario> TbPagoSalario;
    @FXML
    private Button BtBuscarSalario;
    @FXML
    private TableColumn<ModelSalario, String> ColIdSal;
    @FXML
    private TableColumn<ModelSalario, String> ColNomSal;
    @FXML
    private TableColumn<ModelSalario, String> ColCargSal;
    @FXML
    private TableColumn<ModelSalario, String> ColMontoSal;
    @FXML
    private TableColumn<ModelSalario, String> ColFechaSal;
    @FXML
    private Label labelprueba;
    
    
    public void Listar() {

        ObservableList<ModelSalario> salarioList = FXCollections.observableArrayList();
        
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT `jfg_pagosalario`.`PaSe_Id`, `jfg_personas`.`Per_Nombres`, `jfg_personas`.`Per_Apellidos`, `jfg_cargo`.`Car_Cargo`, `jfg_cargo`.`Car_Salario`, `jfg_pagosalario`.`PaSe_Fecha`\n" +
                                   "FROM `jfg_pagosalario` \n" +
                                   "LEFT JOIN `jfg_personas` ON `jfg_pagosalario`.`Per_Id` = `jfg_personas`.`Per_Id`\n" +
                                   ", `jfg_cargo`;");

            while (rs.next()) {
                salarioList.add(new ModelSalario(rs.getString("PaSe_Id"), rs.getString("Per_Nombres")+" "+rs.getString("Per_Apellidos"), rs.getString("Car_Cargo"), rs.getString("Car_Salario"), rs.getString("PaSe_Fecha")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        ColIdSal.setCellValueFactory(new PropertyValueFactory<>("PaSe_Id"));
        ColNomSal.setCellValueFactory(new PropertyValueFactory<>("Per_Nombres"+" "+"Per_Apellidos"));
        ColCargSal.setCellValueFactory(new PropertyValueFactory<>("Car_Cargo"));
        ColMontoSal.setCellValueFactory(new PropertyValueFactory<>("Car_Salario"));
        ColFechaSal.setCellValueFactory(new PropertyValueFactory<>("PaSe_Fecha"));

        TbPagoSalario.setItems(salarioList);
    }

    public void Nuevo() {
        TxtIdEmpleadoSalario.setText("");
        TxtMontoSalario.setText("");
        //TxtFechaSalario.setText("");
        index = -1;
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Listar();
    }    

    @FXML
    private void Eliminar(ActionEvent event) {
    }

    @FXML
    private void Limpiar(ActionEvent event) {
    }

    @FXML
    private void Modificar(ActionEvent event) {
    }

    @FXML
    private void Pagar(ActionEvent event) {
    }

    @FXML
    private void Buscar(ActionEvent event) {
    }
    
}
