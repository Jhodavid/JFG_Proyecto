/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFG_Models;

/**
 *
 * @author jhoda
 */
public class ModelProveedor {
    
    String Prov_Id;
    String Prov_Nombre;

    public ModelProveedor(String Prov_Id, String Prov_Nombre) {
        this.Prov_Id = Prov_Id;
        this.Prov_Nombre = Prov_Nombre;
    }

    public String getProv_Id() {
        return Prov_Id;
    }

    public void setProv_Id(String Prov_Id) {
        this.Prov_Id = Prov_Id;
    }

    public String getProv_Nombre() {
        return Prov_Nombre;
    }

    public void setProv_Nombre(String Prov_Nombre) {
        this.Prov_Nombre = Prov_Nombre;
    }
            
    
}
