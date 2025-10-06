import java.util.Scanner;

public class Ejemplo06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Declarar array de enteros
		int[] numeros = new int[5];

		System.out.print("1º numero: ");
		numeros[0] = Integer.parseInt(teclado.nextLine());
		System.out.print("2º numero: ");
		numeros[1] = Integer.parseInt(teclado.nextLine());
		System.out.print("3º numero: ");
		numeros[2] = Integer.parseInt(teclado.nextLine());
		System.out.print("4º numero: ");
		numeros[3] = Integer.parseInt(teclado.nextLine());
		System.out.print("5º numero: ");
		numeros[4] = Integer.parseInt(teclado.nextLine());

		System.out.println("Numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);		
		}
	teclado.close();
	}
}
