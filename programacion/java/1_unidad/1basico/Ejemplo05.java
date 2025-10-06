
import java.util.Scanner;

public class Ejemplo05{
	public static void main (String[] args){


		System.out.print("Introduce un nombre: ");
		Scanner teclado = new Scanner(System.in);

		String nombre = teclado.nextLine();
		System.out.println("El nombre es: " + nombre);
		teclado.close();
	}
}