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
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author FRANKLIN
 */
public class JFG_PrincipalController implements Initializable {

    @FXML
    private VBox vBoxBotones;
    @FXML
    private Button BtFactura;
    @FXML
    private Button BtCliente;
    @FXML
    private Button BtInventario;
    @FXML
    private Button BtProductos;
    @FXML
    private Button BtTipoCliente;
    @FXML
    private Button BtTipoDocumento;
    @FXML
    private Button BtPagos;
    @FXML
    private Button BtEmpleados;
    @FXML
    private Button BtProveedor;
    @FXML
    private Button BtCargo;
    @FXML
    private Label LbNombre;
    @FXML
    private Label LbCargo;
    @FXML
    private Label NombrePerIng;
    @FXML
    private Label CargoPerIng;
    @FXML
    private Pane IdPane;
    @FXML
    private ScrollPane IdScrollPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
