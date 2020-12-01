
package JFG_Models;

/**
 *
 * @author CAMILO A TRUYOL O
 */
public class ModelTservicio {
    String TiSe_Id ;
    String TiSe_TipoServicio;
  
    
    public ModelTservicio(String TiSe_Id, String TiSe_TipoServicio) {
        this.TiSe_Id = TiSe_Id;
        this.TiSe_TipoServicio = TiSe_TipoServicio;
    
    }

    public String getTiSe_Id() {
        return TiSe_Id;
    }

    public void setTiSe_Id(String TiSe_Id) {
        this.TiSe_Id = TiSe_Id;
    }

    public String getTiSe_TipoServicio() {
        return TiSe_TipoServicio;
    }

    public void setTiSe_TipoServicio(String TiSe_TipoServicio) {
        this.TiSe_TipoServicio = TiSe_TipoServicio;
    }
}
