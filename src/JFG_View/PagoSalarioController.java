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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author FRANKLIN
 */
public class PagoSalarioController implements Initializable {
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
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
