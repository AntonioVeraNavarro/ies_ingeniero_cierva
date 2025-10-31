import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String respuesta = "s";
        while (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Triángulo. Lado A: ");
            double a = Double.parseDouble(keyboard.nextLine());
            System.out.print("Triángulo. Lado B: ");
            double b = Double.parseDouble(keyboard.nextLine());
            System.out.print("Triángulo. Lado C: ");
            double c = Double.parseDouble(keyboard.nextLine()); 


            if (a <= 0 || b <= 0 || c <= 0 || a+b<=c || a+c<=b || b+c<=a) {
                System.out.println("Los lados introducidos no forman un triángulo.");
            } else if (a == b && b == c) {
                System.out.println("El triángulo es equilátero.");
            } else if (a != b && a != c && b != c) {
                System.out.println("El triángulo es escaleno.");
            } else {
                System.out.println("El triángulo es isósceles.");
            }
        
            while (true) { 
                System.out.print("¿Quieres repetir el programa? (s/n): ");
                respuesta = keyboard.nextLine().trim();

                if (respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")) {
                    break;
                } 
                System.out.println("Entrada no válida. Por favor, responde con 's' o 'n'.");
            }
        }
        System.out.println("Fin del programa.");
    }
}