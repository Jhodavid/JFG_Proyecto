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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jhoda
 */
public class FacturaModuleController implements Initializable {

    @FXML
    private TextField txt_idcli;
    @FXML
    private TextField txt_nombrecli;
    @FXML
    private TextField txt_idemp;
    @FXML
    private TextField txt_nombreemp;
    @FXML
    private TextField txt_idpro;
    @FXML
    private TextField txt_nombrepro;
    @FXML
    private DatePicker dt_fecha;
    @FXML
    private TextField txt_departamento;
    @FXML
    private TextField txt_muncipio;
    @FXML
    private TextField txt_direccion;
    @FXML
    private TextField txt_cantidad;
    @FXML
    private Button bt_agregarproducto;
    @FXML
    private Button bt_registrarcompra;
    @FXML
    private TableColumn<?, ?> tb_idpro;
    @FXML
    private TableColumn<?, ?> tb_nombrepro;
    @FXML
    private TableColumn<?, ?> tb_cantidad;
    @FXML
    private Button bt_eliminarpro;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
