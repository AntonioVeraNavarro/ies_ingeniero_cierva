// Escribe un programa simple que lea exactamente ocho números enteros y luego escriba la suma de todos ellos.
// No hay que guardar los valores individualmente; sólo su suma acumulada.
// Debe realizarse utilizando un bucle.
import java.util.Scanner;
public class Numeros8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int suma = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Introduce el número entero " + i + ": ");
            int numero = kb.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los ocho números es: " + suma);

        kb.close();
    }
}