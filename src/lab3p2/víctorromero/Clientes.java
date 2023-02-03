package lab3p2.víctorromero;

import java.util.ArrayList;

public class Clientes {

    private int id;
    private String name;
    private ArrayList<Vehiculos> vehiculosProp;
    private double saldo;

    public Clientes() {
    }

    public Clientes(int id, String name, ArrayList<Vehiculos> vehiculosProp, double saldo) {
        this.id = id;
        this.name = name;
        this.vehiculosProp = vehiculosProp;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehiculos> getVehiculosProp() {
        return vehiculosProp;
    }

    public void setVehiculosProp(ArrayList<Vehiculos> vehiculosProp) {
        this.vehiculosProp = vehiculosProp;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Clientes{ \n"
                + "ID=" + id + "\n"
                + "Name=" + name + "\n"
                + "Vehiculos Propiedad=" + vehiculosProp + "\n"
                + "Saldo=" + saldo + '}';
    }

}
