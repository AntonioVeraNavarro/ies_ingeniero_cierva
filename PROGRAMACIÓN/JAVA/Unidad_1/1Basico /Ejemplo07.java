import java.util.Scanner;

public class Ejemplo07{
	public static void main (String[] args){
	
		System.out.println("introduce un numero entero para multiplicar por 2: ");

		Scanner teclado = new Scanner(System.in);

		Double numero = teclado.nextDouble();

		System.out.println(" el numero " + numero + " por 2 da: " + (numero*2) );


	}
}