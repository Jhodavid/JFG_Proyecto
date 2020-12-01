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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author FRANKLIN
 */
public class PagoServicioController implements Initializable {

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
    private TableView<?> TbPagoSalario;
    @FXML
    private Button BtBuscarSalario;
    @FXML
    private Label labelprueba;
    @FXML
    private TableColumn<?, ?> ColIdSal;
    @FXML
    private TableColumn<?, ?> ColNomSal;
    @FXML
    private TableColumn<?, ?> ColCargSal;
    @FXML
    private TableColumn<?, ?> ColMontoSal;
    @FXML
    private TableColumn<?, ?> ColFechaSal;

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
