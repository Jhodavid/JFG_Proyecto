
package JFG_Models;

/**
 *
 * @author jhoda
 */
public class ModelEmpleado {
    
    String Emp_Usuario;
    int Per_Id;
    int Car_Id;
    String Emp_FechaContrato;
    String Emp_FechaSalida;
    String Cont_Id;
    
    String Cont_Contraseña;

    public ModelEmpleado(String Emp_Usuario, int Per_Id, int Car_Id, String Emp_FechaContrato, String Emp_FechaSalida, String Cont_Id, String Cont_Contraseña) {
        this.Emp_Usuario = Emp_Usuario;
        this.Per_Id = Per_Id;
        this.Car_Id = Car_Id;
        this.Emp_FechaContrato = Emp_FechaContrato;
        this.Emp_FechaSalida = Emp_FechaSalida;
        this.Cont_Id = Cont_Id;
        this.Cont_Contraseña = Cont_Contraseña;
    }

    public String getEmp_Usuario() {
        return Emp_Usuario;
    }

    public void setEmp_Usuario(String Emp_Usuario) {
        this.Emp_Usuario = Emp_Usuario;
    }

    public int getPer_Id() {
        return Per_Id;
    }

    public void setPer_Id(int Per_Id) {
        this.Per_Id = Per_Id;
    }

    public int getCar_Id() {
        return Car_Id;
    }

    public void setCar_Id(int Car_Id) {
        this.Car_Id = Car_Id;
    }

    public String getEmp_FechaContrato() {
        return Emp_FechaContrato;
    }

    public void setEmp_FechaContrato(String Emp_FechaContrato) {
        this.Emp_FechaContrato = Emp_FechaContrato;
    }

    public String getEmp_FechaSalida() {
        return Emp_FechaSalida;
    }

    public void setEmp_FechaSalida(String Emp_FechaSalida) {
        this.Emp_FechaSalida = Emp_FechaSalida;
    }

    public String getCont_Id() {
        return Cont_Id;
    }

    public void setCont_Id(String Cont_Id) {
        this.Cont_Id = Cont_Id;
    }

    public String getCont_Contraseña() {
        return Cont_Contraseña;
    }

    public void setCont_Contraseña(String Cont_Contraseña) {
        this.Cont_Contraseña = Cont_Contraseña;
    }

    
    
    
}
