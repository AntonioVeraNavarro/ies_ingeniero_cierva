import java.util.Scanner;
public class MayorDeDos {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int num1 = keyboard.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = keyboard.nextInt();
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
        keyboard.close();
    }
}
