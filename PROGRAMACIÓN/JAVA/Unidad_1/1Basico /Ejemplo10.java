
import java.util.Scanner;
public class Ejemplo10{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		
		
		/* Para evitar el bug de: 
		
		System.out.println("introduce un numero: ");

		int numero = teclado.nextLine();

		System.out.println("introduce tu nombre: ");
		String nombre = teclado.nextLine();

		System.out.println("Tu nombre es: " + nombre);
		System.out.println("El numero es: " + numero);

		Hay que poner integer.parseInt() 
		
		*/

		System.out.println("introduce un numero: ");

		int numero = Integer.parseInt(teclado.nextLine());

		System.out.println("introduce tu nombre: ");
		String nombre = teclado.nextLine();

		System.out.println("Tu nombre es: " + nombre);
		System.out.println("El numero es: " + numero);
	}
}