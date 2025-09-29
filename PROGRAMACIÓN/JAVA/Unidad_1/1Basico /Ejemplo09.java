import java.util.Scanner;

public class Ejemplo09{
	public static void main (String[] args){

		 Scanner teclado = new Scanner(System.in);
		 System.out.println("introduce un numero entero: ");
		 String numero1 = teclado.nextLine();

		 System.out.println("introduce un numero con decimales: ");
		 String numero2 = teclado.nextLine();

		 int num1 = Integer.parseInt(numero1);
		 double num2 = Double.parseDouble(numero2);

		 System.out.println("el primer numero es: " + num1);	
		 System.out.println("el segundo numero es: " + num2);	

	}
}