import java.util.Scanner;
public class Ejemplo3{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce un numero: ");

		int numero = teclado.nextInt();

		System.out.println("Condicion: " + (numero > 0));

		if (numero>0){

			System.out.println("el numero es positivo");
		}
		else{

			System.out.println("el numero es negativo");
		}



	}
}