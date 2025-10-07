import java.util.Scanner;

public class Ejemplo08{
	public static void main (String[] args){

		 Scanner teclado = new Scanner(System.in);
		 System.out.print("Introduce un numero entero: ");
		 int numero1 = Integer.parseInt(teclado.nextLine());
		 

		 System.out.print("Introduce un numero con decimales: ");
		 Double numero2 = Double.parseDouble(teclado.nextLine());


		 System.out.println("El primer numero es: " + numero1);	
		 System.out.println("El segundo numero por 2 es: " + (numero2*2));	
		 teclado.close();
	}
}