package lab3p2.víctorromero;

public class Camion extends Vehiculos{

    private int volumenMax;
    private int altura;
    private boolean excavadora;

    public Camion() {
    }

    public Camion(int volumenMax, int altura, boolean excavadora, String color, String marca, String modelo, int añoFab, double precio, int cantLlantas) {
        super(color, marca, modelo, añoFab, precio, cantLlantas);
        this.volumenMax = volumenMax;
        this.altura = altura;
        this.excavadora = excavadora;
    }

    public int getVolumenMax() {
        return volumenMax;
    }

    public void setVolumenMax(int volumenMax) {
        this.volumenMax = volumenMax;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isExcavadora() {
        return excavadora;
    }

    public void setExcavadora(boolean excavadora) {
        this.excavadora = excavadora;
    }

    @Override
    public String toString() {
        return "Camion{\n" 
                + "VolumenMax=" + volumenMax + "\n"
                + "Altura=" + altura + "\n"
                + "Excavadora=" + excavadora + '}';
    }

}
