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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author jhoda
 */
public class JFG_LogginFXMLController implements Initializable {

    private Label theLabel;
    @FXML
    private TextField TxtUsuario;
    @FXML
    private TextField TxtContraseña;
    @FXML
    private Button BtIngresar;
    @FXML
    private Button btSalir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
       
    }    

   

    @FXML
    private void SalirAction(ActionEvent event) {
        System.exit(0);
       
    }
    
}
