import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num1 = teclado.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El numero " + num1 + " es par.");
        } else {
            System.out.println("El numero " + num1 + " es impar.");
        }
        teclado.close();
    }
}
