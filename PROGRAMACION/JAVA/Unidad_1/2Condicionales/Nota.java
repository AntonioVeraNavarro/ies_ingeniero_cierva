import java.util.Scanner;
public class Nota{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introduce tu nota: ");
		double mark = Double.parseDouble(keyboard.nextLine());


		if(mark < 5) {
			System.out.println("Has suspendido.");
		 
		}
		else if(mark >= 5 && mark <6) {
			System.out.println("Tienes un suficiente.");
		}

		else if(mark >= 6 && mark < 7) {
			System.out.println("Tienes un bien.");
		}
		else if(mark >= 7 && mark < 9) {
			System.out.println("Tienes un notable.");
		}
		else if(mark >=9 && mark <= 10) {
			System.out.println("Tienes un sobresaliente");
		}
		else if(mark <0 || mark >10){
			System.out.println("Nota no válida.");
		}
 	}
}