import java.util.Scanner;

public class Ejemplo07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Declarar array de enteros
		 System.out.print("¿Cuantos números quieres?, Escribe un número: ");
		 int cantidad = Integer.parseInt(teclado.nextLine());

		int[] numeros = new int[cantidad];

		for(int i = 0; i < numeros.length; i++) {
			System.out.print((i+1) + "º numero: ");
			numeros[i] = Integer.parseInt(teclado.nextLine());
		}

		System.out.println("Numeros: ");		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);		
		}
	teclado.close();
	}
}
