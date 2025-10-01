import java.util.Scanner;

public class Ejemplo06{
	public static void main (String[] args){
	
		System.out.print("introduce un numero entero para dividir entre 2: ");

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt();

		System.out.println("El numero " + numero + " entre 2 da: " + (numero/2) );

		teclado.close();
	}
}