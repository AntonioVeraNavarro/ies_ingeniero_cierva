import java.util.Scanner;
public class Nombre1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduce el primer nombre: ");
        String name = keyboard.nextLine();

        System.out.print("Introduce la edad de la primera persona: ");
        int age = Integer.parseInt(keyboard.nextLine());

        System.out.print("Introduce el segundo nombre: ");
        String name2 = keyboard.nextLine();

        System.out.print("Introduce la edad de la segunda persona: ");
        int age2 = Integer.parseInt(keyboard.nextLine());

        System.out.println("La primera persona se llama: " + name + " y tiene " + age + " años.");
        System.out.println("La segunda persona se llama: " + name2 + " y tiene " + age2 + " años.");

        keyboard.close();
    }
}
