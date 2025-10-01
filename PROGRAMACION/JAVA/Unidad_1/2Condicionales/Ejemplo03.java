import java.util.Scanner;
public class Ejemplo03{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un numero: ");

		int numero = teclado.nextInt();

		System.out.println("Condicion: " + (numero > 0));

		if (numero > 0){

			System.out.println("El numero es positivo");
		}
		else{

			System.out.println("El numero es negativo");
		}


		teclado.close();
	}
}