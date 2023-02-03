package lab3p2.víctorromero;

public class Bus extends Vehiculos{

    private int cantPasajeros;
    private String tipoBus;

    public Bus() {
        super();
    }

    public Bus(int cantPasajeros, String tipoBus, String color, String marca, String modelo, int añoFab, double precio, int cantLlantas) {
        super(color, marca, modelo, añoFab, precio, cantLlantas);
        this.cantPasajeros = cantPasajeros;
        if (cantPasajeros <= 50) {
            tipoBus = "Rapidito";
        } else {
            tipoBus = "De Ruta";
        }
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        if (cantPasajeros <= 50) {
            tipoBus = "Rapidito";
        } else {
            tipoBus = "De Ruta";
        }
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    @Override
    public String toString() {
        return "Bus{\n" + "\n"
                + "CantPasajeros=" + cantPasajeros + "\n"
                + "TipoBus=" + tipoBus + '}';
    }

}
