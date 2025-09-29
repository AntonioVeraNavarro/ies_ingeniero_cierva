import java.util.Scanner;
public class Ejemplo04{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un numero para comprobar si es par o impar: ");

		int numero = Integer.parseInt(teclado.nextLine());


		if( numero%2 == 0 ){

			System.out.println("El numero es par");
		}
		else{

			System.out.println("El numero es impar");
		}



	}
}