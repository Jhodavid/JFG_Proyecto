
package JFG_View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class JFG_Loggin extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("JFG_Principal.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Principal");
        stage.initStyle(StageStyle.UNDECORATED);
        //PARA QUITAR EL CERRAR, MINIMIZAR Y AGRANDAR VENTANA         
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] arg){
        launch(arg);
   } 
}
