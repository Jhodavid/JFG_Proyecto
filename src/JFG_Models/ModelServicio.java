
package JFG_Models;

/**
 *
 * @author CAMILO A TRUYOL O
 */
public class ModelServicio {
    String PaSe_Id;
    String PaSe_Precio;
    String Pase_Fecha;
    String TiSe_TipoServicio;

  

    public String getTiSe_TipoServicio() {
        return TiSe_TipoServicio;
    }

    public void setTiSe_TipoServicio(String TiSe_TipoServicio) {
        this.TiSe_TipoServicio = TiSe_TipoServicio;
    }

    public ModelServicio(String PaSe_Id,  String PaSe_Precio, String Pase_Fecha, String TiSe_TipoServicio) {
        this.PaSe_Id = PaSe_Id;
       
        this.PaSe_Precio = PaSe_Precio;
        this.Pase_Fecha = Pase_Fecha;
    }

    public String getPaSe_Id() {
        return PaSe_Id;
    }

    public void setPaSe_Id(String PaSe_Id) {
        this.PaSe_Id = PaSe_Id;
    }

    

    public String getPaSe_Precio() {
        return PaSe_Precio;
    }

    public void setPaSe_Precio(String PaSe_Precio) {
        this.PaSe_Precio = PaSe_Precio;
    }

    public String getPase_Fecha() {
        return Pase_Fecha;
    }

    public void setPase_Fecha(String Pase_Fecha) {
        this.Pase_Fecha = Pase_Fecha;
    }
    
    
    
}
