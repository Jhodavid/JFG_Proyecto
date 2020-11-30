/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_View;

import JFG_Controller.JFG_Operations;
import JFG_Controller.MysqlConnect;
import JFG_Models.ModelCargo;
import JFG_Models.ModelTservicio;
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
public class TipoServicioModuleController implements Initializable {
 
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
    private TextField txt_nombre;
    @FXML
    private Button bt_buscar;
    @FXML
    private Button bt_registrar;
    @FXML
    private TableColumn<?, ?> tb_id;
    @FXML
    private TableColumn<?, ?> tb_nombre;
    @FXML
    private Button bt_eliminar;
    @FXML
    private TableView<?> Tb_TipoServicio;

    public void Listar(){
        
        ObservableList<ModelTservicio> TservicioList = FXCollections.observableArrayList();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from jfg_tiposervicio");
            
            while(rs.next()){
                TservicioList.add(new ModelTservicio(Integer.parseInt(rs.getString("TiSe_Id")),rs.getString("TiSe_TipoServicio")));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            tb_id.setCellValueFactory(new PropertyValueFactory<>("TiSe_Id"));
            tb_nombre.setCellValueFactory(new PropertyValueFactory<>("TiSe_TipoServicio"));
        
            
            Tb_TipoServicio.setItems(TservicioList);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Listar();
    }    

    @FXML
    private void RegistrarServicioAction(ActionEvent event) {
         
    }

    @FXML
    private void getSelectedMouse(MouseEvent event) {
         index = Tb_TipoServicio.getSelectionModel().getSelectedIndex();
        if(index <= -1){
            return;
        }
        txt_id.setText(tb_id.getCellData(index).toString());
        txt_nombre.setText(tb_nombre.getCellData(index).toString());
       
    }
    
}
