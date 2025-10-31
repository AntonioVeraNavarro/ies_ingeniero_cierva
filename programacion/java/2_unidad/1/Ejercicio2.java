import java.util.Scanner;
// sacar todos los números primos entre dos números introducidos por teclado (ambos inclusive)
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Introduce el segundo número: ");
        int num2 = Integer.parseInt(keyboard.nextLine());
        boolean esPrimo;

        if (num1 < 1 || num2 < 1 || num1 == num2) {
            System.out.println("Ambos números deben ser mayor de 0 y distintos.");
        } else {
            int menor = Math.min(num1, num2);
            int mayor = Math.max(num1, num2);
            System.out.println("Números primos entre " + menor + " y " + mayor + ":");

            for (int i = menor; i <= mayor; i++) {
                esPrimo = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                
                if (esPrimo && i > 1) {
                    System.out.println(i);
                }
            }
        }
        System.out.println("\nFin del programa.");
    }
}