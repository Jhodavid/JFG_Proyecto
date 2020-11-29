
package JFG_Models;

/**
 *
 * @author jhoda
 */
public class ModelCargo {
    
    int Car_Id;
    String Car_Cargo;
    double Car_Salario;

    public ModelCargo(int Car_Id, String Car_Cargo, double Car_Salario) {
        this.Car_Id = Car_Id;
        this.Car_Cargo = Car_Cargo;
        this.Car_Salario = Car_Salario;
    }

    public int getCar_Id() {
        return Car_Id;
    }

    public void setCar_Id(int Car_Id) {
        this.Car_Id = Car_Id;
    }

    public String getCar_Cargo() {
        return Car_Cargo;
    }

    public void setCar_Cargo(String Car_Cargo) {
        this.Car_Cargo = Car_Cargo;
    }

    public double getCar_Salario() {
        return Car_Salario;
    }

    public void setCar_Salario(double Car_Salario) {
        this.Car_Salario = Car_Salario;
    }
    
    
    
}
