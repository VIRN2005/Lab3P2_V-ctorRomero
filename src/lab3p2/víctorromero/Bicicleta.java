package lab3p2.víctorromero;

public class Bicicleta {

    private String descripcion;
    private int rueda;
    private boolean BMX;

    public Bicicleta() {
    }

    public Bicicleta(String descripcion, int rueda, boolean BMX) {
        this.descripcion = descripcion;
        this.rueda = rueda;
        this.BMX = BMX;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRueda() {
        return rueda;
    }

    public void setRueda(int rueda) {
        this.rueda = rueda;
    }

    public boolean isBMX() {
        return BMX;
    }

    public void setBMX(boolean BMX) {
        this.BMX = BMX;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "\n"
                + "Descripcion=" + descripcion + "\n"
                + "Rueda=" + rueda + "\n"
                + "BMX=" + BMX + '}';
    }

}
