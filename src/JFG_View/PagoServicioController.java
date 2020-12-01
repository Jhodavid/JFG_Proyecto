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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author FRANKLIN
 */
public class PagoServicioController implements Initializable {

    @FXML
    private TextField TxtIdServicio;
    @FXML
    private ComboBox<?> CmbTipoServicio;
    @FXML
    private Label labelprueba2;
    @FXML
    private Button BtEliminarServicio;
    @FXML
    private Button BtLimpliarServicio;
    @FXML
    private Button BtModificarServicio;
    @FXML
    private Button BtRegistrarServicio;
    @FXML
    private TextField TxtPrecioServicio;
    @FXML
    private DatePicker TxtFechaServicio;
    @FXML
    private TableView<?> TbPagoServicio;

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
