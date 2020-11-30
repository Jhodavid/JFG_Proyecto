
package JFG_Models;

/**
 *
 * @author jhoda
 */
public class ModelEmpleado {
    
    String Emp_Usuario;
    String Per_Id;
    String Car_Id;
    String Emp_FechaContrato;
    String Emp_FechaSalida;
    
    String Cont_Contraseña;

    public ModelEmpleado(String Emp_Usuario, String Per_Id, String Car_Id, String Emp_FechaContrato, String Emp_FechaSalida) {
        this.Emp_Usuario = Emp_Usuario;
        this.Per_Id = Per_Id;
        this.Car_Id = Car_Id;
        this.Emp_FechaContrato = Emp_FechaContrato;
        this.Emp_FechaSalida = Emp_FechaSalida;
    }

    public String getEmp_Usuario() {
        return Emp_Usuario;
    }

    public void setEmp_Usuario(String Emp_Usuario) {
        this.Emp_Usuario = Emp_Usuario;
    }

    public String getPer_Id() {
        return Per_Id;
    }

    public void setPer_Id(String Per_Id) {
        this.Per_Id = Per_Id;
    }

    public String getCar_Id() {
        return Car_Id;
    }

    public void setCar_Id(String Car_Id) {
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
}
