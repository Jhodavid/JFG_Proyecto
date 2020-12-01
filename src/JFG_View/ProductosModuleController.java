/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_View;

import JFG_Controller.JFG_Operations;
import JFG_Controller.MysqlConnect;
import JFG_Models.ModelProductos;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author jhoda
 */
public class ProductosModuleController implements Initializable {
    
    JFG_Operations op = new JFG_Operations();
    String usuario = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/jfgdb";
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    String fecha;
    
    int index = -1;
    
    @FXML
    private TextField txt_pronom;
    @FXML
    private Button bt_registrar;
    @FXML
    private Button bt_buscar;
    @FXML
    private TextField txt_proid;
    @FXML
    private TextField txt_desc;
    @FXML
    private TextField txt_precio;
    @FXML
    private TableView<ModelProductos> ProductosTable;
    @FXML
    private TableColumn<ModelProductos, String> tb_proid;
    @FXML
    private TableColumn<ModelProductos, String> tb_nombre;
    @FXML
    private TableColumn<ModelProductos, String> tb_precio;
    @FXML
    private TableColumn<ModelProductos, String> tb_desc;
    @FXML
    private Button bt_registrar1;
    

    
    public void Listar() {

        ObservableList<ModelProductos> productoList = FXCollections.observableArrayList();

        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT `jfg_productos`.`Prod_Id`, `jfg_productos`.`Prod_Nombre`, `jfg_productos`.`Prod_Descripcion`, `jfg_precio`.`Prec_Precio`\n" +
                                   "FROM `jfg_productos` \n" +
                                   "LEFT JOIN `jfg_precio` ON `jfg_precio`.`Prod_Id` = `jfg_productos`.`Prod_Id`;");

            while (rs.next()) {
                productoList.add(new ModelProductos(rs.getString("Prod_Id"), rs.getString("Prod_Nombre"), rs.getString("Prod_Descripcion"), rs.getString("Prec_Precio")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        tb_proid.setCellValueFactory(new PropertyValueFactory<>("Prod_Id"));
        tb_nombre.setCellValueFactory(new PropertyValueFactory<>("Prod_Nombre"));
        tb_precio.setCellValueFactory(new PropertyValueFactory<>("Prod_Descripcion"));
        tb_desc.setCellValueFactory(new PropertyValueFactory<>("Prec_Precio"));

        ProductosTable.setItems(productoList);
    }

    public void Nuevo() {
        txt_proid.setText("");
        txt_pronom.setText("");
        txt_desc.setText("");
        txt_precio.setText("");
        index = -1;
    }
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Listar();
        java.util.Date fech = new Date();
        fecha = Integer.toString(fech.getYear()+1900)+"/"+Integer.toString(fech.getMonth()+1)+"/"+Integer.toString(fech.getDay()-1);
        //System.out.println(fecha);
    }    

    @FXML
    private void Registrar(ActionEvent event) {
    }

    @FXML
    private void Buscar(ActionEvent event) {
    }

    @FXML
    private void Seleccionar(MouseEvent event) {
    }

    @FXML
    private void Modificar(ActionEvent event) {
    }
    
}
