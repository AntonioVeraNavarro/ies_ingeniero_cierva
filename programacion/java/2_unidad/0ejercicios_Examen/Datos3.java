// Escribe un programa simple que pida tres datos de tipo entero por teclado, los guarde y los muestre ordenados por pantalla.
import java.util.Scanner;
public class Datos3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int num1 = kb.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = kb.nextInt();

        System.out.print("Introduce el tercer número entero: ");
        int num3 = kb.nextInt();

        int mayor, medio, menor;

        if (num1 > num2 && num1 > num3 ) {
            mayor = num1;
            if (num2 > num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }

        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
            if (num1 > num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 > num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }

        System.out.println("Números ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor);
        
        kb.close();
    }
}