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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jhoda
 */
public class ClienteModuleController implements Initializable {

    @FXML
    private TextField txt_id;
    @FXML
    private TextField txt_dni;
    @FXML
    private TextField txt_nombre;
    @FXML
    private TextField txt_apellidos;
    @FXML
    private TextField txt_correo;
    @FXML
    private Button bt_buscar;
    @FXML
    private Button bt_registrar;
    @FXML
    private TableColumn<?, ?> tb_id;
    @FXML
    private TableColumn<?, ?> tb_dni;
    @FXML
    private TableColumn<?, ?> tb_nombres;
    @FXML
    private TableColumn<?, ?> tb_apellidos;
    @FXML
    private TableColumn<?, ?> tb_correo;
    @FXML
    private TableColumn<?, ?> tb_tipocliente;
    @FXML
    private ComboBox<?> cbx_tipocliente;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
