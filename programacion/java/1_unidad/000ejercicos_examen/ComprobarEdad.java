import java.util.Scanner;
public class ComprobarEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        if (edad < 18 && edad >= 0) {
            System.out.println("Eres menor de edad.");
        } else if (edad >= 18 && edad < 66) {
            System.out.println("Eres mayor de edad en edad de trabajar.");
        } else if (edad >= 66) {
            System.out.println("Eres jubilado.");
        } else {
            System.out.println("Edad no válida.");
        }
        teclado.close();
    } 
}