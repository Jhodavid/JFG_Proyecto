/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_View;

import JFG_Controller.JFG_Operations;
import JFG_Controller.MysqlConnect;
import JFG_Models.ModelCargo;
import JFG_Models.ModelTCliente;
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
 * @author jhoda
 */
public class TipoClienteModuleController implements Initializable {
    
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
    private TextField txt_id;
    @FXML
    private TextField txt_tipocliente;
    @FXML
    private TextField txt_descuento;
    @FXML
    private TextField txt_monto;
    @FXML
    private TableColumn<ModelTCliente, String> tb_id;
    @FXML
    private TableColumn<ModelTCliente, String> tb_tipocliente;
    @FXML
    private TableColumn<ModelTCliente, String> tb_monto;
    @FXML
    private TableColumn<ModelTCliente, String> tb_descuento;
    @FXML
    private Button bt_eliminar;
    @FXML
    private Button bt_Modifcar;
    @FXML
    private TableView<ModelTCliente> Tb_TipoCliente;
    @FXML
    private Button bt_registrar;
    @FXML
    private Button bt_Nuevo;

    //Metodo para listar en la tabla
    
    public void Listar() {

        ObservableList<ModelTCliente> TClienteList = FXCollections.observableArrayList();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from jfg_tipocliente");

            while (rs.next()) {
                TClienteList.add(new ModelTCliente(rs.getString("TCl_Id"), rs.getString("TCl_TipoCliente"), rs.getString("TCl_Descuento"),rs.getString("TCl_Monto")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        tb_id.setCellValueFactory(new PropertyValueFactory<>("TCl_Id"));
        tb_tipocliente.setCellValueFactory(new PropertyValueFactory<>("TCl_TipoCliente"));
        tb_descuento.setCellValueFactory(new PropertyValueFactory<>("TCl_Descuento"));
        tb_monto.setCellValueFactory(new PropertyValueFactory<>("TCl_Monto"));
        
        Tb_TipoCliente.setItems(TClienteList);
    }
    
      public void Nuevo(){
            txt_id.setText("");
            txt_tipocliente.setText("");
            txt_descuento.setText("");
            txt_monto.setText("");
            
            index = -1;
    }
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txt_id.setEditable(false);
        Listar();
    }    

    @FXML
    private void Btn_Modificar(ActionEvent event) {
        if (index == -1) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debe seleccionar un Tipo de Cliente");
            alert.showAndWait();
        } else {
            try {
                stmt = con.createStatement();
                stmt.executeUpdate("update jfg_tipocliente set TCl_Id = "+txt_id.getText()+","+"TCl_TipoCliente = '"+
                        txt_tipocliente.getText()+"',TCl_Descuento = "+txt_descuento.getText()+ ",TCl_Monto = "+txt_monto.getText()+" where TCl_Id = "+txt_id.getText());
                Nuevo();
                Listar();
                index = -1;
            } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    @FXML
    private void MouseClicked_TCliente(MouseEvent event) {
        index = Tb_TipoCliente.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        txt_id.setText(tb_id.getCellData(index));
        txt_tipocliente.setText(tb_tipocliente.getCellData(index));
        txt_descuento.setText(tb_descuento.getCellData(index));
        txt_monto.setText(tb_monto.getCellData(index));
    }
    
    

    @FXML
    private void Btn_Eliminar(ActionEvent event) {
        if (index == -1) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debe seleccionar un cargo");
            alert.showAndWait();
        } else {
            try {
                stmt = con.createStatement();
                stmt.executeUpdate("delete from jfg_tipocliente where TCl_Id = "+txt_id.getText());
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
          if(txt_tipocliente.getText().length() == 0  && txt_descuento.getText().length() == 0 && txt_monto.getText().length() == 0){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debe llenar todos los campos");
            alert.showAndWait();
        }else{
            try {
            stmt = con.createStatement();
            stmt.executeUpdate("insert into jfg_tipocliente values(null,'" + txt_tipocliente.getText() + "'," + txt_descuento.getText() + "," +  txt_monto.getText()+ ")");
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
    private void Btn_Nuevo(ActionEvent event) {
        Nuevo();
    }
    
    
}
