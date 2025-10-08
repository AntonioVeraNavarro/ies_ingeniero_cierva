/**
 * Supuesto1_1.java
 * El programa pide por consola una serie de datos y más tarde los imprime por consola.
 * Antonio Vera Navarro 08/10/25
 */

import java.util.Scanner;

public class Supuesto1_1 {
    public static void main(String args[]) {     
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Pon tu nombre completo: ");
        String name = teclado.nextLine();

        System.out.print("Pon tu DNI, NIF o NIE: ");
        String id = teclado.nextLine();

        System.out.print("Pon tu email: ");
        String email = teclado.nextLine();

        System.out.print("Pon tu dirección: ");
        String address = teclado.nextLine();

        System.out.print("Pon tu codigo postal: ");
        int postal = Integer.parseInt(teclado.nextLine());

        System.out.print("Pon tu provincia: ");
        String province = teclado.nextLine();

        System.out.println("La persona es " + name + " (" + id + ")");
        System.out.println("Email de contacto: " + email);
        System.out.println("Dirección: " + address + ". " + postal + ", " + province);
    }
}

