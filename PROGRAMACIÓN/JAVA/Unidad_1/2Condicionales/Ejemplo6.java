import java.util.Scanner;
public class Ejemplo6{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);


		System.out.println("adivina la palabra");
		
		String texto = teclado.nextLine();
		
		final String PALABRA = "coche";

		if(texto.equals(PALABRA)){
			System.out.println("la plabra coincide");
		}
		else{

			System.out.println("la palabra no coincide");
		}


	}
  
}