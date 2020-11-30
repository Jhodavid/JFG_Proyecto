
package JFG_Models;

/**
 *
 * @author CAMILO A TRUYOL O
 */
public class ModelTDocumento {
    String TDo_Id;
    String TDo_TipoDocumento;
    
    public ModelTDocumento(String TDo_Id, String TDo_TipoDocumento) {
        this.TDo_Id = TDo_Id;
        this.TDo_TipoDocumento = TDo_TipoDocumento;
    
    }
    

    public String getTDo_Id() {
        return TDo_Id;
    }

    public void setTDo_Id(String TDo_Id) {
        this.TDo_Id = TDo_Id;
    }

    public String getTDo_TipoDocumento() {
        return TDo_TipoDocumento;
    }

    public void setTDo_TipoDocumento(String TDo_TipoDocumento) {
        this.TDo_TipoDocumento = TDo_TipoDocumento;
    }
}
