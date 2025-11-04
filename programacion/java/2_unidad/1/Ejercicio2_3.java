import java.util.Scanner;
public class Ejercicio2_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduce el valor n de la sucesión de Fibonacci: ");
        int pos = Integer.parseInt(keyboard.nextLine());

        if (pos < 0) {
            System.out.println("La posición debe ser 0 o mayor");
        } else if (pos == 0) {
            System.out.println("Posición 0: 0");
        } else if (pos == 1) {
            System.out.println("Posición 1: 1");
        } else {
            int penultimo = 0;
            int ultimo = 1;

            for (int i =2; i <= pos; i++) {
                int aux = penultimo +  ultimo;
                penultimo = ultimo;
                ultimo = aux;
            }
            System.out.println("Posición " + pos + ": " + ultimo);
        }
    }
}