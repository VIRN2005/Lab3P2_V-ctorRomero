package lab3p2.víctorromero;

public class Motocicleta {

    private String despMotor;
    private boolean electric;

    public Motocicleta() {
    }

    public Motocicleta(String despMotor, boolean electric) {
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
