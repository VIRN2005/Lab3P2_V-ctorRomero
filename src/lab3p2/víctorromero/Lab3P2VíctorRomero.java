package lab3p2.víctorromero;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab3P2VíctorRomero {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Concesionaria> concesionaria = new ArrayList();
    static ArrayList<Vehiculos> vehiculos = new ArrayList();
    static ArrayList<Clientes> personas = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Victor Romero - 12211079\n");

        int opcion;
        do {
            System.out.println("_____________________________________________________________ ");
            System.out.println(" ");
            System.out.println(">> MENU <<");
            System.out.println("----------------------- ");

            System.out.println("1 -> CRUD Concesionaria");
            System.out.println("2 -> CRUD Clientes");
            System.out.println("3 -> CRUD Vehículos");
            System.out.println("4 -> Compra/Venta de vehículos por parte de un cliente");

            System.out.println("5 -> SALIDA");
            System.out.println(" ");
            System.out.println(" ");

            System.out.print("Ingrese su Opcion: ");
            opcion = leer.nextInt();
            System.out.println("=> La Opcion escojida es: " + opcion);
            System.out.println(" ");

            switch (opcion) {
                case 1: {
                    System.out.println(">> MENU CONCESIONARIA <<");
                    System.out.println("----------------------- ");

                    System.out.println("1 -> Agregar");
                    System.out.println("2 -> Modificar Direccion");
                    System.out.println("3 -> Eliminar");

                    System.out.print("Ingrese su Opcion: ");
                    int con = leer.nextInt();
                    System.out.println("=> La Opcion escojida es: " + con);
                    System.out.println(" ");

                    switch (con) {
                        case 1: {// Agregar
                            concesionaria.add(newCon());
                        }
                        break;

                        case 2: {// Modificar
                            String chain = "";
                            for (Object o : concesionaria) {
                                chain += concesionaria.indexOf(o) + "- " + o + "\n";
                            }
                            System.out.println(chain);

                            System.out.println(">> Ingrese el Indice a Modificar");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= concesionaria.size()) {
                                if (concesionaria.get(pos) instanceof Concesionaria) {
                                    leer.nextLine();
                                    System.out.println(">> Ingrese la nueva Direccion");
                                    String newDireccion = leer.nextLine();

                                    concesionaria.get(pos).setDireccion(newDireccion);

                                } else {
                                    System.out.println("Indice no valido");
                                }
                            }
                        }
                        break;

                        case 3: {// Eliminar
                            String chain = "";
                            for (Object o : concesionaria) {
                                chain += concesionaria.indexOf(o) + "- " + o + "\n";
                            }
                            System.out.println(chain);

                            System.out.println(">> Ingrese el Indice a Modificar");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= concesionaria.size()) {
                                if (concesionaria.get(pos) instanceof Concesionaria) {

                                    concesionaria.remove(pos);

                                } else {
                                    System.out.println("Indice no valido");
                                }
                            }
                        }
                    }
                }
                break;

                case 2: {
                    System.out.println(">> MENU CLIENTE <<");
                    System.out.println("----------------------- ");

                    System.out.println("1 -> Agregar");
                    System.out.println("2 -> Eliminar");

                    System.out.print("Ingrese su Opcion: ");
                    int client = leer.nextInt();
                    System.out.println("=> La Opcion escojida es: " + client);
                    System.out.println(" ");

                    switch (client) {
                        case 1: {// Agregar
                            personas.add(newClientes());
                        }
                        break;

                        case 2: {// Eliminar
                            String chain = "";
                            for (Object o : personas) {
                                chain += personas.indexOf(o) + "- " + o + "\n";
                            }
                            System.out.println(chain);

                            System.out.println(">> Ingrese el Indice a Modificar");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= personas.size()) {
                                if (personas.get(pos) instanceof Clientes) {

                                    personas.remove(pos);

                                } else {
                                    System.out.println("Indice no valido");
                                }
                            }
                        }
                    }
                }
                break;

                case 3: {
                    System.out.println(">> MENU VEHICULO <<");
                    System.out.println("----------------------- ");

                    System.out.println("1 -> Agregar");
                    System.out.println("2 -> Modificar Vehiculo");
                    System.out.println("3 -> Eliminar");

                    System.out.print("Ingrese su Opcion: ");
                    int car = leer.nextInt();
                    System.out.println("=> La Opcion escojida es: " + car);
                    System.out.println(" ");

                    switch (car) {
                        case 1: {// Agregar
                            vehiculos.add(newVehiculos());
                        }
                        break;

                        case 2: {//Modificar
                            String chain = "";
                            for (Object o : vehiculos) {
                                chain += vehiculos.indexOf(o) + "- " + o + "\n";
                            }
                            System.out.println(chain);

                            System.out.println(">> Ingrese el Indice a Modificar");
                            int pos = leer.nextInt();

                            int option = 0;

                            if (pos >= 0 && pos <= vehiculos.size() - 1) {
                                if (vehiculos.get(pos) instanceof Vehiculos) {
                                    String chain1 = "";
                                    for (Object o : concesionaria) {
                                        chain1 += concesionaria.indexOf(o) + "- " + o + "\n";
                                    }
                                    System.out.println(chain1);

                                    System.out.println(">> Ingrese el Indice a Modificar en Consecionaria");
                                    int pos1 = leer.nextInt();

                                    System.out.println(">> Ingrese el Indice a Modificar del Vehiculo");
                                    int veh = leer.nextInt();

                                    if (concesionaria.get(pos1).getVehiculos().get(veh) instanceof Carro) {
                                        option = 1;
                                    }

                                    if (concesionaria.get(pos1).getVehiculos().get(veh) instanceof Camion) {
                                        option = 2;
                                    }

                                    if (concesionaria.get(pos1).getVehiculos().get(veh) instanceof Bus) {
                                        option = 3;
                                    }

                                    if (concesionaria.get(pos1).getVehiculos().get(veh) instanceof Motocicleta) {
                                        option = 4;
                                    }

                                    if (concesionaria.get(pos1).getVehiculos().get(veh) instanceof Bicicleta) {
                                        option = 5;
                                    }

                                    switch (option) {
                                        case 1: { // Carro
                                            System.out.println(">> MENU VEHICULO <<");
                                            System.out.println("----------------------- ");

                                            System.out.println("1 -> Cantidad de Ruedas");
                                            System.out.println("2 -> Motor");
                                            System.out.println("3 -> Velocidad Max");

                                            System.out.print("Ingrese su Opcion: ");
                                            int carro = leer.nextInt();
                                            System.out.println("=> La Opcion escojida es: " + carro);
                                            System.out.println(" ");

                                            switch (carro) {
                                                case 1: { // Cant Ruedas
                                                    System.out.println(">> Ingrese cantidad de Llantas: ");
                                                    int wheels = leer.nextInt();
                                                    ((Carro) vehiculos.get(pos)).setCantRuedas(wheels);
                                                }
                                                break;

                                                case 2: {
                                                    leer.nextLine();
                                                    System.out.println(">> Ingrese Motor: ");
                                                    String mot = leer.nextLine();
                                                    ((Carro) vehiculos.get(pos)).setMotor(mot);
                                                }
                                                break;

                                                case 3: {
                                                    System.out.println(">> Ingrese Velocidad Max: ");
                                                    int max = leer.nextInt();
                                                    ((Carro) vehiculos.get(pos)).setCantRuedas(max);
                                                }
                                                break;

                                            }
                                        }
                                        break;

                                        case 2: { // Camion Carga 
                                            System.out.println(">> MENU CAMION <<");
                                            System.out.println("----------------------- ");

                                            System.out.println("1 -> Volumen Maximo");
                                            System.out.println("2 -> Altura");
                                            System.out.println("3 -> Excavadora");

                                            System.out.print("Ingrese su Opcion: ");
                                            int cam = leer.nextInt();
                                            System.out.println("=> La Opcion escojida es: " + cam);
                                            System.out.println(" ");

                                            switch (cam) {
                                                case 1: {
                                                    System.out.println(">> Ingrese Volumen Max: ");
                                                    int max = leer.nextInt();
                                                    ((Camion) vehiculos.get(pos)).setVolumenMax(max);
                                                }
                                                break;

                                                case 2: {
                                                    System.out.println(">> Ingrese Altura: ");
                                                    int max = leer.nextInt();
                                                    ((Camion) vehiculos.get(pos)).setAltura(max);
                                                }
                                                break;

                                                case 3: {
                                                    System.out.println(">> Tiene Excavadora? (1> Si // 2> No) : ");
                                                    int yesno = leer.nextInt();
                                                    boolean ex = false;

                                                    if (yesno == 1) {
                                                        ex = true;
                                                    }
                                                    if (yesno == 2) {
                                                        ex = false;
                                                    }
                                                    ((Camion) vehiculos.get(pos)).setExcavadora(ex);
                                                }
                                                break;
                                            }
                                        }
                                        break;

                                        case 3: { // Bus
                                            System.out.println(">> MENU BUS <<");
                                            System.out.println("----------------------- ");

                                            System.out.println("1 -> Cant Pasajeros");

                                            System.out.print("Ingrese su Opcion: ");
                                            int cam = leer.nextInt();
                                            System.out.println("=> La Opcion escojida es: " + cam);
                                            System.out.println(" ");

                                            switch (cam) {
                                                case 1: {
                                                    System.out.println(">> Ingrese Cant Pasajeros: ");
                                                    int max = leer.nextInt();
                                                    ((Bus) vehiculos.get(pos)).setCantPasajeros(max);
                                                }
                                                break;
                                            }

                                        }
                                        break;

                                        case 4: {
                                            System.out.println(">> MENU MOTO <<");
                                            System.out.println("----------------------- ");

                                            System.out.println("1 -> Desp Motor");
                                            System.out.println("2 -> Electric");

                                            System.out.print("Ingrese su Opcion: ");
                                            int cam = leer.nextInt();
                                            System.out.println("=> La Opcion escojida es: " + cam);
                                            System.out.println(" ");

                                            switch (cam) {
                                                case 1: {
                                                    leer.nextLine();
                                                    System.out.println(">> Desp Motor: ");
                                                    String mot = leer.nextLine();
                                                    ((Motocicleta) vehiculos.get(pos)).setDespMotor(mot);
                                                }
                                                break;

                                                case 2: {
                                                    System.out.println(">> Es electrica? (1> Si // 2> No) : ");
                                                    int yesno = leer.nextInt();
                                                    boolean ex = false;

                                                    if (yesno == 1) {
                                                        ex = true;
                                                    }
                                                    if (yesno == 2) {
                                                        ex = false;
                                                    }
                                                    ((Motocicleta) vehiculos.get(pos)).setElectric(ex);
                                                }

                                                break;
                                            }

                                        }
                                        break;

                                        case 5: {
                                            System.out.println(">> MENU BICI <<");
                                            System.out.println("----------------------- ");

                                            System.out.println("1 -> Descripcion");
                                            System.out.println("2 -> Rueda");
                                            System.out.println("3 -> BMX");

                                            System.out.print("Ingrese su Opcion: ");
                                            int cam = leer.nextInt();
                                            System.out.println("=> La Opcion escojida es: " + cam);
                                            System.out.println(" ");

                                            switch (cam) {
                                                case 1: {
                                                    leer.nextLine();
                                                    System.out.println(">> Desp Motor: ");
                                                    String mot = leer.nextLine();
                                                    ((Bicicleta) vehiculos.get(pos)).setDescripcion(mot);
                                                }
                                                break;

                                                case 2: {
                                                    System.out.println(">> Ingrese Cant Pasajeros: ");
                                                    int max = leer.nextInt();
                                                    ((Bicicleta) vehiculos.get(pos)).setCantLlantas(max);

                                                }
                                                break;

                                                case 3: {
                                                    System.out.println(">> Es BMX   ? (1> Si // 2> No) : ");
                                                    int yesno = leer.nextInt();
                                                    boolean ex = false;

                                                    if (yesno == 1) {
                                                        ex = true;
                                                    }
                                                    if (yesno == 2) {
                                                        ex = false;
                                                    }
                                                    ((Motocicleta) vehiculos.get(pos)).setElectric(ex);
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                    }

                                } else {
                                    System.out.println("Indice no valido");
                                }
                            }

                        }
                        break;

                        case 3: {// Eliminar
                            String chain = "";
                            for (Object o : vehiculos) {
                                chain += vehiculos.indexOf(o) + "- " + o + "\n";
                            }
                            System.out.println(chain);

                            System.out.println(">> Ingrese el Indice a Modificar");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= vehiculos.size()) {
                                if (vehiculos.get(pos) instanceof Vehiculos) {

                                    vehiculos.remove(pos);

                                } else {
                                    System.out.println("Indice no valido");
                                }
                            }
                        }
                        break;
                    }
                }
                break;

                case 4: { //Compra/Venta de vehículos por parte de un cliente
                    System.out.println(">> MENU COMPRA / VENTA <<");
                    System.out.println("----------------------- ");

                    System.out.println("1 -> Compra");
                    System.out.println("2 -> Venta");

                    System.out.print("Ingrese su Opcion: ");
                    int op = leer.nextInt();
                    System.out.println("=> La Opcion escojida es: " + op);
                    System.out.println(" ");

                    switch (op) {

                        case 1: { // Compra
                            double venta1 = 0;
                            double venta2 = 0;

                            String chain = "";
                            for (Object o : concesionaria) {
                                if (o instanceof Concesionaria) {
                                    chain += concesionaria.indexOf(o) + "- " + o + "\n";
                                }
                            }
                            System.out.println(chain);

                            System.out.println(">> Ingrese el Indice a Modificar");
                            int pos = leer.nextInt();

                            venta1 = vehiculos.get(pos).getPrecio();
                            venta2 = vehiculos.get(pos).getPrecio() * 0.075;

                            double Venta = venta1 + venta2;

                            double moneyCliente = personas.get(pos).getSaldo();
                            double moneyInc = concesionaria.get(pos).getSaldo();

                            personas.get(pos).setSaldo(moneyCliente - Venta);
                            personas.get(pos).getVehiculosProp().add(vehiculos.get(pos));

                            concesionaria.get(pos).setSaldo(moneyInc + Venta);
                            concesionaria.get(pos).getVehiculos().add(vehiculos.get(pos));

                            System.out.println("EXCELENTE! COMPRA REALIZADA");
                        }
                        break;

                        case 2: {
                            String chain = "";
                            for (Object o : concesionaria) {
                                if (o instanceof Concesionaria) {
                                    chain += concesionaria.indexOf(o) + "- " + o + "\n";
                                }
                            }
                            System.out.println(chain);

                            System.out.println(">> Ingrese el Indice a Modificar");
                            int pos = leer.nextInt();

                            double moneyCliente = personas.get(pos).getSaldo();
                            double moneyInc = concesionaria.get(pos).getSaldo();

                            double priceCar = vehiculos.get(pos).getPrecio();

                            personas.get(pos).setSaldo(moneyCliente + priceCar);
                            concesionaria.get(pos).setSaldo(moneyInc - priceCar);

                            personas.get(pos).getVehiculosProp().remove(pos);
                            vehiculos.remove(pos);

                            System.out.println("EXCELENTE! VENTA REALIZADA");
                        }
                        break;
                    }

                }
                break;
                
                case 5:{
                    System.out.println("HA SALIDO DEL PROGRAMA");
                    System.out.println("VUELVA PRONTOOOO!");
                }
                break;
                
                default:{
                    System.out.println("ERROR 404");
                    System.out.println("NUMERO INVALIDO!");
                }
            }
        } while (opcion
                != 5);

    }

    static Concesionaria newCon() {
        String nombreEmpresa;
        String ID_Empresa;
        String direccion;
        ArrayList<Vehiculos> vehiculos = new ArrayList();
        ArrayList<Clientes> personas = new ArrayList();
        double saldo;

        Concesionaria retorno;
        
        System.out.println(">> Ingrese el Nombre de la Empresa: ");
        nombreEmpresa = leer.nextLine();

        leer.next();
        System.out.println(">> Ingrese el ID de la Empresa: ");
        ID_Empresa = leer.nextLine();

        leer.nextLine();
        System.out.println(">> Ingrese la Direccion de la Empresa: ");
        direccion = leer.nextLine();

        System.out.println(">> Ingrese el Saldo de la Empresa: ");
        saldo = leer.nextDouble();

        retorno = new Concesionaria(nombreEmpresa, ID_Empresa, direccion, vehiculos, personas, saldo);
        return retorno;
    }

    static Clientes newClientes() {
        int id;
        String name;
        ArrayList<Vehiculos> vehiculosProp = new ArrayList();
        double saldo;

        Clientes retorno;

        System.out.println(">> Ingrese el ID del Cliente: ");
        id = leer.nextInt();

        leer.nextLine();
        System.out.println(">> Ingrese el Nombre del Cliente: ");
        name = leer.nextLine();

        System.out.println(">> Ingrese el Saldo del Cliente: ");
        saldo = leer.nextDouble();

        retorno = new Clientes(id, name, vehiculosProp, saldo);
        return retorno;
    }

    static Vehiculos newVehiculos() {
        String color;
        String marca;
        String modelo;
        int añoFab;
        double precio;
        int cantLlantas;

        Vehiculos retorno;
        
        System.out.println(">> Ingrese el Color del Vehiculo: ");
        color = leer.nextLine();

        leer.next();
        System.out.println(">> Ingrese la Marca del Vehiculo: ");
        marca = leer.nextLine();

        leer.next();
        System.out.println(">> Ingrese el Modelo del Vehiculo: ");
        modelo = leer.nextLine();

        System.out.println(">> Ingrese el Year del Vehiculo: ");
        añoFab = leer.nextInt();

        System.out.println(">> Ingrese el Precio del Vehiculo:: ");
        precio = leer.nextDouble();

        System.out.println(">> Ingrese la cantidad de llantas del Vehiculo: ");
        cantLlantas = leer.nextInt();

        retorno = new Vehiculos(color, marca, modelo, añoFab, precio, cantLlantas);
        return retorno;
    }
}
