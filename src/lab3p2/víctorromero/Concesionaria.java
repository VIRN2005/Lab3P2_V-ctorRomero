package lab3p2.víctorromero;

import java.util.ArrayList;

public class Concesionaria {

    private String nombreEmpresa;
    private String ID_Empresa;
    private String direccion;
    private ArrayList<Vehiculos> vehiculos;
    private ArrayList<Clientes> personas;
    private double saldo;

    public Concesionaria() {
    }

    public Concesionaria(String nombreEmpresa, String ID_Empresa, String direccion, ArrayList<Vehiculos> vehiculos, ArrayList<Clientes> personas, double saldo) {
        this.nombreEmpresa = nombreEmpresa;
        this.ID_Empresa = ID_Empresa;
        this.direccion = direccion;
        this.vehiculos = vehiculos;
        this.personas = personas;
        this.saldo = saldo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getID_Empresa() {
        return ID_Empresa;
    }

    public void setID_Empresa(String ID_Empresa) {
        this.ID_Empresa = ID_Empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Clientes> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Clientes> personas) {
        this.personas = personas;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "\n"
                + "NombreEmpresa=" + nombreEmpresa + "\n"
                + "ID_Empresa=" + ID_Empresa + "\n"
                + "Direccion=" + direccion + "\n"
                + "Vehiculos=" + vehiculos + "\n"
                + "Personas=" + personas + "\n"
                + "Saldo=" + saldo + '}';
    }

}
