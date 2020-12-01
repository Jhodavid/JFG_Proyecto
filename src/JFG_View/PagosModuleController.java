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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author jhoda
 */
public class PagosModuleController implements Initializable {

    @FXML
    private Button BtPedidos;
    @FXML
    private AnchorPane IdAnchorPane2;
    @FXML
    private Button BtSalario;
    @FXML
    private Button BtServicios;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PagoPedidosAction(ActionEvent event) throws IOException {
        AnchorPane root1 = FXMLLoader.load(getClass().getResource("PagoPedidos.fxml"));  
        IdAnchorPane2.getChildren().add(root1);
    }

    @FXML
    private void PagoSalariosAction(ActionEvent event) throws IOException {
        AnchorPane root2 = FXMLLoader.load(getClass().getResource("PagoSalario.fxml"));  
        IdAnchorPane2.getChildren().add(root2);
    }

    @FXML
    private void PagoServicio(ActionEvent event) throws IOException {
        AnchorPane root3 = FXMLLoader.load(getClass().getResource("PagoServicio.fxml"));  
        IdAnchorPane2.getChildren().add(root3);
    }
    
}
