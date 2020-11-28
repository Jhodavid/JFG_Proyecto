/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_ViewModules;

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
public class ProductosModuleController implements Initializable {

    @FXML
    private ComboBox<?> cbx_estado;
    @FXML
    private TextField txt_nom;
    @FXML
    private Button bt_registrar;
    @FXML
    private Button bt_buscar;
    @FXML
    private TextField txt_pro;
    @FXML
    private TextField txt_desc;
    @FXML
    private TextField txt_precio;
    @FXML
    private TableColumn<?, ?> tb_id;
    @FXML
    private TableColumn<?, ?> tb_nombre;
    @FXML
    private TableColumn<?, ?> tb_precio;
    @FXML
    private TableColumn<?, ?> tb_estado;
    @FXML
    private TableColumn<?, ?> tb_desc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
