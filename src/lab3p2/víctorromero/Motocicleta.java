package lab3p2.víctorromero;

public class Motocicleta extends Vehiculos{

    private String despMotor;
    private boolean electric;

    public Motocicleta() {
        super();
    }

    public Motocicleta(String despMotor, boolean electric, String color, String marca, String modelo, int añoFab, double precio, int cantLlantas) {
        super(color, marca, modelo, añoFab, precio, cantLlantas);
        this.despMotor = despMotor;
        this.electric = electric;
    }

    public String getDespMotor() {
        return despMotor;
    }

    public void setDespMotor(String despMotor) {
        this.despMotor = despMotor;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "despMotor=" + despMotor + ", electric=" + electric + '}';
    }

}
