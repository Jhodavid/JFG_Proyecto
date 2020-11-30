/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_View;

import JFG_Controller.JFG_Operations;
import JFG_Controller.MysqlConnect;
import JFG_Models.ModelCargo;
import JFG_Models.ModelTDocumento;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Camilo A Truyol
 */
public class TipoDocumentoModuleController implements Initializable {
    JFG_Operations op = new JFG_Operations();
    String usuario = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/jfgdb";
    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst = null;

    int index = -1;

    @FXML
    private TextField txt_tipodocumento;
    @FXML
    private TableView<ModelTDocumento> tab_documentos;
    @FXML
    private TableColumn<ModelTDocumento, String> tab_id;
    @FXML
    private TableColumn<ModelTDocumento, String> tab_tipodocumento;
    @FXML
    private Button bt_limpiar;
    @FXML
    private Button bt_eliminar;
    @FXML
    private Button bt_registrar;
    @FXML
    private Button bt_modifciar;
 //Metodo para listar en la tabla
    @FXML
    private TextField txt_Id;
    
       public void Listar() {

        ObservableList<ModelTDocumento> TDocumentoList = FXCollections.observableArrayList();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from jfg_tipodocumento");

            while (rs.next()) {
                TDocumentoList.add(new ModelTDocumento(rs.getString("TDo_Id"), rs.getString("TDo_TipoDocumento")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        tab_id.setCellValueFactory(new PropertyValueFactory<>("TDo_Id"));
        tab_tipodocumento.setCellValueFactory(new PropertyValueFactory<>("TDo_TipoDocumento"));
        

        tab_documentos.setItems(TDocumentoList);
    }
    
    public void Nuevo() {
        txt_tipodocumento.setText("");
        index = -1;
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txt_Id.setEditable(false);
         Listar();
    }    

    @FXML
    private void MouseClicked_TDocumento(MouseEvent event) {
         index = tab_documentos.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        txt_Id.setText(tab_id.getCellData(index));
        txt_tipodocumento.setText(tab_tipodocumento.getCellData(index));
        
    
    }

    @FXML
    private void Btn_limpiar(ActionEvent event) {
        Nuevo();
    }

    @FXML
    private void btn_eliminar(ActionEvent event) {
          if (index == -1) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debe seleccionar un Tipo de documento");
            alert.showAndWait();
        } else {
            try {
                stmt = con.createStatement();
                stmt.executeUpdate("delete from jfg_tipodocumento where TDo_Id = " + txt_Id.getText());
                Nuevo();
                Listar();
                index = -1;
            } catch (SQLException ex) {
                Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void Btn_registrar(ActionEvent event) {
        if(txt_tipodocumento.getText().length() == 0 ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debe llenar todos los campos");
            alert.showAndWait();
        }else{
            try {
            stmt = con.createStatement();
            stmt.executeUpdate("insert into jfg_tipodocumento values(null,'" + txt_tipodocumento.getText() + "')");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            Nuevo();
            index = -1;
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        Listar();
        }
    }

    @FXML
    private void Btn_modificar(ActionEvent event) {
         if (index == -1) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debe seleccionar un Tipo de documento");
            alert.showAndWait();
        } else {
            try {
                stmt = con.createStatement();
                stmt.executeUpdate("update jfg_tipodocumento set TDo_Id = "+txt_Id.getText()+","+"TDo_TipoDocumento = '"+
                        txt_tipodocumento.getText()+"'"+" where TDo_Id= "+txt_Id.getText());
                Nuevo();
                Listar();
                index = -1;
            } catch (SQLException ex) {
                Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
