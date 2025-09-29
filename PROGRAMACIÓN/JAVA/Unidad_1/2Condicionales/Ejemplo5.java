import java.util.Scanner;
public class Ejemplo5{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe tu nota para recibir tu calificacion: ");

		double nota = Double.parseDouble(teclado.nextLine());

		if(nota <= 0 || nota >= 10){

			System.out.println("Tu calificacion es: NO VALIDA" );
		}
		if(nota < 5 && nota >= 0){

			System.out.println("Tu calificacion es: SUSPENSO");
		}
		else if(nota >= 5 && nota<6){

			System.out.println("Tu calificacion es: SUFICIENTE");		
		}
		else if(nota >= 6 && nota < 7){

			System.out.println("Tu calificacion es: BIEN");			
		}
		else if(nota >= 7 && nota < 8){

			System.out.println("Tu calificacion es: NOTABLE");			
		}
		else if(nota >= 8 && nota <= 10){

			System.out.println("Tu calificacion es: SOBRESALIENTE");			
		}
		

	}
}