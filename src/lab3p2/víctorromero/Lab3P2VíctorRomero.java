package lab3p2.víctorromero;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab3P2VíctorRomero {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Victor Romero - 12211079\n");

        int opcion;
        do {
            System.out.println("_____________________________________________________________ ");
            System.out.println(" ");
            System.out.println(">> MENU <<");
            System.out.println("----------------------- ");

            System.out.println("1 -> Agregar Casa");
            System.out.println("2 -> Listar Casa");
            System.out.println("3 -> Modificar Casa");
            System.out.println("4 -> Eliminar Casa");

            System.out.println("5 -> SALIDA");
            System.out.println(" ");
            System.out.println(" ");

            System.out.print("Ingrese su Opcion: ");
            opcion = leer.nextInt();
            System.out.println("=> La Opcion escojida es: " + opcion);
            System.out.println(" ");

        } while (opcion != 5);
    }

}
