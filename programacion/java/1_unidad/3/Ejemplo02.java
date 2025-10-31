import java.util.Scanner;

public class Ejemplo02 { 
	public static void main(String[] args) {
		System.out.println("Inicio de programa: ");
		Scanner teclado = new Scanner(System.in);

		System.out.print("Indica una tabla de multiplicar: ");
		int num = Integer.parseInt(teclado.nextLine());

		//Mostar tabla
		System.out.println("Tabla del " + num + ": ");

		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + num + " = " + num*i);
		}
	
		System.out.println("Fin de programa");
    	teclado.close();
	}
}