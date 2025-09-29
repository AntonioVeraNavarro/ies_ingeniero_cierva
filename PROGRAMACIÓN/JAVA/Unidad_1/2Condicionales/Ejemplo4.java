import java.util.Scanner;
public class Ejemplo4{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce un numero para comprobar si es par o impar: ");

		int numero = Integer.parseInt(teclado.nextLine());


		if( numero%2 == 0 ){

			System.out.println("el numero es par");
		}
		else{

			System.out.println("el numero es impar");
		}



	}
}