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

                }
                break;

                case 3: {

                }
                break;

                case 4: {

                }
                break;
            }

        } while (opcion != 5);
    }

    static Concesionaria newCon() {
        String nombreEmpresa;
        String ID_Empresa;
        String direccion;
        ArrayList<Vehiculos> vehiculos = new ArrayList();
        ArrayList<Clientes> personas = new ArrayList();
        double saldo;

        Concesionaria retorno;

        leer.nextLine();
        System.out.println(">> Ingrese el Nombre de la Empresa: ");
        nombreEmpresa = leer.nextLine();

        leer.nextLine();
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

}
