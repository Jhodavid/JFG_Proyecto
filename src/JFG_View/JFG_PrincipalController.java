/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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

    private Pane IdPane;
    @FXML
    private Button BtCerrarSesión;
    @FXML
    private AnchorPane IdAnchorPane;
    @FXML
    private Button BtTipoDocumento1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }

    @FXML
    private void FacturaAction(ActionEvent event) throws IOException {        
        AnchorPane root1 = FXMLLoader.load(getClass().getResource("FacturaModule.fxml"));  
        IdAnchorPane.getChildren().add(root1);   
            
    }

    @FXML
    private void TipoServiciosAction(ActionEvent event) throws IOException {
        AnchorPane root2 = FXMLLoader.load(getClass().getResource("TipoServicioModule.fxml"));  
        IdAnchorPane.getChildren().add(root2);
    }

    @FXML
    private void RegistroClienteAction(ActionEvent event) throws IOException {
        AnchorPane root3 = FXMLLoader.load(getClass().getResource("ClienteModule.fxml"));  
        IdAnchorPane.getChildren().add(root3);
    }

    @FXML
    private void InventarioAction(ActionEvent event) throws IOException {
        AnchorPane root4 = FXMLLoader.load(getClass().getResource("InventarioModule.fxml"));  
        IdAnchorPane.getChildren().add(root4);
    }

    @FXML
    private void TipoDocumentoAction(ActionEvent event) throws IOException {
        AnchorPane root5 = FXMLLoader.load(getClass().getResource("TipoDocumentoModule.fxml"));  
        IdAnchorPane.getChildren().add(root5);
    }

    @FXML
    private void PagosAction(ActionEvent event) throws IOException {
        AnchorPane root6 = FXMLLoader.load(getClass().getResource("PagosModule.fxml"));  
        IdAnchorPane.getChildren().add(root6);
    }

}
