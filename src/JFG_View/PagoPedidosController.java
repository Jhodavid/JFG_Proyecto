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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author FRANKLIN
 */
public class PagoPedidosController implements Initializable {
    @FXML
    private TableView<?> TbPagoPedidos;
    @FXML
    private Button BtBuscarPedidos;
    @FXML
    private TextField TxtIdPedidos;
    @FXML
    private ComboBox<?> CmbProveedorPedidos;
    @FXML
    private TextField TxtProductoPedidos;
    @FXML
    private TextField TxtCantidadPedidos;
    @FXML
    private TextField TxtPrecioPedidos;
    @FXML
    private Button BtRegistrarPedidos;
    @FXML
    private Button BtModificarPedidos;
    @FXML
    private Button BtEliminarPedidos;
    @FXML
    private Button BtLimpiarPedidos;
    @FXML
    private DatePicker TxtFechaPedidos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    

    
}
