import java.util.Scanner;
public class MayorDeTres{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		System.out.println("COMPARAR 3 NÚMEROS:");
			
		System.out.print("Introduce el primer numero: ");

		double num1 = Double.parseDouble(teclado.nextLine());

		System.out.print("Introduce el segundo numero: ");

		double num2 = Double.parseDouble(teclado.nextLine());

		System.out.print("Introduce el tercer numero: ");

		double num3 = Double.parseDouble(teclado.nextLine());



		if(num1 == num2 && num3 < num1){
			System.out.println("El numero mayor es el: " + num1);
		}
		else if(num2 == num3 && num1 < num3){
			System.out.println("El numero mayor es el: " + num2);
		}
		else if(num1 == num3 && num2 < num1){
			System.out.println("El numero mayor es el: " + num1);
		}
		else if(num1 > num2 && num1 > num3){
			System.out.println("El mayor es: " + num1 );
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("El mayor es: " + num2 );
		}
		else if(num3 > num1 && num3 > num2){
			System.out.println("El mayor es: " + num3 );
		}
		else {
			System.out.println("Los tres son iguales");
		}


	}
}
