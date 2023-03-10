package lab3p2.víctorromero;

public class Carro extends Vehiculos{
    
    private int cantRuedas;
    private String motor;
    private int velocidadMax;

    public Carro() {
        super();
    }

    public Carro(int cantRuedas, String motor, int velocidadMax, String color, String marca, String modelo, int añoFab, double precio, int cantLlantas) {
        super(color, marca, modelo, añoFab, precio, cantLlantas);
        this.cantRuedas = cantRuedas;
        this.motor = motor;
        this.velocidadMax = velocidadMax;
    }


    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    @Override
    public String toString() {
        return "Carro{ \n"
                + "Cantidad Ruedas=" + cantRuedas + "\n"
                + "Motor=" + motor + "\n"
                + "VelocidadMax=" + velocidadMax + '}';
    }
    
    
    
    
}
