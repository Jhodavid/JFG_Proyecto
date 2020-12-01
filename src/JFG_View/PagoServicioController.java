/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_View;
import JFG_Controller.JFG_Operations;
import JFG_Controller.MysqlConnect;
import JFG_Models.ModelServicio;
import JFG_Models.ModelTservicio;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

import JFG_Models.ModelServicio;

/**
 * FXML Controller class
 *
 * @author FRANKLIN
 */
public class PagoServicioController implements Initializable {
    
 
    
    String enteroid = null;
     String TipoServicio = null;
    JFG_Operations op = new JFG_Operations();
    String usuario = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/jfgdb";
    Connection con;
    Statement stmt;
    ResultSet rs;
    ResultSet rs2;
    PreparedStatement pst = null;
    int index = -1;

    @FXML
    private TextField TxtIdServicio;
    @FXML
    private ComboBox<String> CmbTipoServicio;
    @FXML
    private Label labelprueba2;
    @FXML
    private Button BtEliminarServicio;
    @FXML
    private Button BtLimpliarServicio;
    @FXML
    private Button BtModificarServicio;
    @FXML
    private Button BtRegistrarServicio;
    @FXML
    private TextField TxtPrecioServicio;
    @FXML
    private DatePicker TxtFechaServicio;
    @FXML
    private TableView<ModelServicio> TbPagoServicio;
    @FXML
    private TableColumn<ModelServicio, String> tb_idServicio;
    @FXML
    private TableColumn<ModelServicio, String> tb_TipoServicio;
    @FXML
    private TableColumn<ModelServicio, String> tb_precio;
    @FXML
    private TableColumn<ModelServicio, String> tb_fecha;

    
     public void ComboBox(){
       
        String id;
         try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from jfg_tiposervicio");

            while (rs.next()) {
                
                CmbTipoServicio.getItems().addAll(rs.getString("TiSe_TipoServicio"));
               
               
            }
               

        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
      public void Listar() {
        
        ObservableList<ModelServicio> PServicioList = FXCollections.observableArrayList();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from jfg_pagoservicio");

            while (rs.next()) {
                PServicioList.add(new ModelServicio(rs.getString("PaSe_Id"),  rs.getString("PaSe_Precio"), rs.getString("Pase_Fecha")));
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        tb_idServicio.setCellValueFactory(new PropertyValueFactory<>("PaSe_Id"));
        tb_TipoServicio.setCellValueFactory(new PropertyValueFactory<>(TipoServicio));
        tb_precio.setCellValueFactory(new PropertyValueFactory<>("PaSe_Precio"));
        tb_fecha.setCellValueFactory(new PropertyValueFactory<>("Pase_Fecha"));
       

        TbPagoServicio.setItems(PServicioList);
    }
      public void Nuevo(){
            TxtIdServicio.setText("");
            CmbTipoServicio.getSelectionModel().clearSelection();
            TxtFechaServicio.getEditor().clear();
            TxtPrecioServicio.setText("");
         
            index = -1;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ComboBox();
        TxtIdServicio.setEditable(false);
     
    }    

    @FXML
    private void btn_eliminar(ActionEvent event) {
    }

    @FXML
    private void btn_limpiar(ActionEvent event) {
        Nuevo();
    }

    @FXML
    private void btn_modificar(ActionEvent event) {
    }

    @FXML
    private void btn_registrar(ActionEvent event) {
        
        String Caracter =  TxtFechaServicio.getValue().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(Caracter);
        String servicio;
        
            try {
            stmt = con.createStatement();
            stmt = con.createStatement();
             rs = stmt.executeQuery("select * from jfg_tiposervicio");

            while (rs.next()) {
                
                CmbTipoServicio.getItems().addAll(rs.getString("TiSe_TipoServicio"));
               
                servicio = CmbTipoServicio.getSelectionModel().getSelectedItem();
               
                
             if (rs.getString("TiSe_TipoServicio").equals(servicio)){
                   TipoServicio = rs.getString("TiSe_TipoServicio");
                   System.out.println("hola");
                }
             if(rs.getString("TiSe_TipoServicio").equals(servicio)){
                    enteroid = rs.getString("TiSe_Id");
                    System.out.println("hola caracola");
                }
            }
            stmt.executeUpdate("insert into jfg_pagoservicio values(null," + TxtPrecioServicio.getText()+ "," + Caracter + ","+ enteroid + ")");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            
            index = -1;
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
              

        }
        Listar();
        
    }

    @FXML
    private void MouseClicked(MouseEvent event) {
    }

    
}
