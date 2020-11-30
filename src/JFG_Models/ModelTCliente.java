
package JFG_Models;

/**
 *
 * @author CAMILO A TRUYOL O
 */
public class ModelTCliente {
    String TCl_Id;
    String TCl_TipoCliente;
    String TCl_Descuento;
    String TCl_Monto;
    
 public ModelTCliente(String TCl_Id, String TCl_TipoCliente, String TCl_Descuento, String TCl_Monto) {
        this.TCl_Id = TCl_Id;
        this.TCl_TipoCliente = TCl_TipoCliente;
        this.TCl_Descuento = TCl_Descuento;
        this.TCl_Monto= TCl_Monto;
    }    

    public String getTCl_Id() {
        return TCl_Id;
    }

    public void setTCl_Id(String TCl_Id) {
        this.TCl_Id = TCl_Id;
    }

    public String getTCl_TipoCliente() {
        return TCl_TipoCliente;
    }

    public void setTCl_TipoCliente(String TCl_TipoCliente) {
        this.TCl_TipoCliente = TCl_TipoCliente;
    }

    public String getTCl_Descuento() {
        return TCl_Descuento;
    }

    public void setTCl_Descuento(String TCl_Descuento) {
        this.TCl_Descuento = TCl_Descuento;
    }

    public String getTCl_Monto() {
        return TCl_Monto;
    }

    public void setTCl_Monto(String TCl_Monto) {
        this.TCl_Monto = TCl_Monto;
    }
}
