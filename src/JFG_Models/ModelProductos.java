
package JFG_Models;

/**
 *
 * @author jhoda
 */
public class ModelProductos {
    
    String Pro_id;
    String Prod_Nombre;
    String Prod_Descripcion;
    String Prod_Estado;
    String Prec_Precio;

    public ModelProductos(String Pro_id, String Prod_Nombre, String Prod_Descripcion, String Prec_Precio) {
        this.Pro_id = Pro_id;
        this.Prod_Nombre = Prod_Nombre;
        this.Prod_Descripcion = Prod_Descripcion;
        this.Prec_Precio = Prec_Precio;
    }

    public String getPro_id() {
        return Pro_id;
    }

    public void setPro_id(String pro_id) {
        this.Pro_id = pro_id;
    }

    public String getProd_Nombre() {
        return Prod_Nombre;
    }

    public void setProd_Nombre(String Prod_Nombre) {
        this.Prod_Nombre = Prod_Nombre;
    }

    public String getProd_Descripcion() {
        return Prod_Descripcion;
    }

    public void setProd_Descripcion(String Prod_Descripcion) {
        this.Prod_Descripcion = Prod_Descripcion;
    }

    public String getPrec_Precio() {
        return Prec_Precio;
    }

    public void setPrec_Precio(String Prec_Precio) {
        this.Prec_Precio = Prec_Precio;
    }

    
}
