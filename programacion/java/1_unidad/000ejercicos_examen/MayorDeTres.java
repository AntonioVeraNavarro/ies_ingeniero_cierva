import java.util.Scanner;
public class MayorDeTres{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		System.out.println("COMPARAR 3 NÚMEROS:");
			
		System.out.print("Introduce el primer numero: ");

		double num1 = Double.parseDouble(teclado.nextLine());

		System.out.print("Introduce el segundo numero: ");

		double num2 = Double.parseDouble(teclado.nextLine());

		System.out.print("Introduce el tercer numero: ");

		double num3 = Double.parseDouble(teclado.nextLine());



		if (num1 > num2 && num1 > num3) {
			System.out.println("Solo el primer número (" + num1 + ") es el mayor.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Solo el segundo número (" + num2 + ") es el mayor.");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("Solo el tercer número (" + num3 + ") es el mayor.");
		} else if (num1 == num2 && num1 > num3) {
			System.out.println("El primer y segundo número (" + num1 + ") son los mayores e iguales.");
		} else if (num2 == num3 && num2 > num1) {
			System.out.println("El segundo y tercer número (" + num2 + ") son los mayores e iguales.");
		} else if (num1 == num3 && num1 > num2) {
			System.out.println("El primer y tercer número (" + num1 + ") son los mayores e iguales.");
		} else if (num1 == num2 && num1 < num3) {
			System.out.println("El tercer número (" + num3 + ") es el mayor, los otros dos son iguales.");
		} else if (num2 == num3 && num2 < num1) {
			System.out.println("El primer número (" + num1 + ") es el mayor, los otros dos son iguales.");
		} else if (num1 == num3 && num1 < num2) {
			System.out.println("El segundo número (" + num2 + ") es el mayor, los otros dos son iguales.");
		} else {
			System.out.println("Los tres números son iguales.");
		}

		teclado.close();
	}
}
