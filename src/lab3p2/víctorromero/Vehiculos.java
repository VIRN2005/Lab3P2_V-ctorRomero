
package lab3p2.víctorromero;

import java.awt.Color;

public class Vehiculos{
    
    protected String color;
    protected String marca;
    protected String modelo;
    protected int añoFab;
    protected double precio;
    protected int cantLlantas;

    public Vehiculos() {
    }

    public Vehiculos(String color, String marca, String modelo, int añoFab, double precio, int cantLlantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFab = añoFab;
        this.precio = precio;
        this.cantLlantas = cantLlantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFab() {
        return añoFab;
    }

    public void setAñoFab(int añoFab) {
        this.añoFab = añoFab;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantLlantas() {
        return cantLlantas;
    }

    public void setCantLlantas(int cantLlantas) {
        this.cantLlantas = cantLlantas;
    }

    @Override
    public String toString() {
        return "Vehiculos{\n" + ""
                + "Color=" + color + "\n"
                + "Marca=" + marca + "\n"
                + "Modelo=" + modelo + "\n"
                + "A\u00f1o Fabricacion=" + añoFab + "\n"
                + "Precio=" + precio + "\n"
                + "Cantidad Llantas=" + cantLlantas + '}';
    }

    
}
