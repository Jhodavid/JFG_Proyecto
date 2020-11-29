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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jhoda
 */
public class TipoClienteModuleController implements Initializable {

    @FXML
    private TextField txt_id;
    @FXML
    private TextField txt_tipocliente;
    @FXML
    private TextField txt_descuento;
    @FXML
    private TextField txt_monto;
    @FXML
    private Button bt_buscar;
    @FXML
    private Button bt_actualizar;
    @FXML
    private TableColumn<?, ?> tb_id;
    @FXML
    private TableColumn<?, ?> tb_tipocliente;
    @FXML
    private TableColumn<?, ?> tb_monto;
    @FXML
    private TableColumn<?, ?> tb_descuento;
    @FXML
    private Button bt_eliminar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
