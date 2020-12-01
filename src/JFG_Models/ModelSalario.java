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
public class ModelSalario {
    
    String Per_Id;
    String Nombre;
    String Cargo;
    String Monto;
    String Fecha;

    public ModelSalario(String Per_Id, String Nombre, String Cargo, String Monto, String Fecha) {
        this.Per_Id = Per_Id;
        this.Nombre = Nombre;
        this.Cargo = Cargo;
        this.Monto = Monto;
        this.Fecha = Fecha;
    }

    public String getPer_Id() {
        return Per_Id;
    }

    public void setPer_Id(String Per_Id) {
        this.Per_Id = Per_Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
}
