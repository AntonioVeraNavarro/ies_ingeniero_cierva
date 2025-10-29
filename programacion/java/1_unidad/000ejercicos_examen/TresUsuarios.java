import java.util.Scanner;
public class TresUsuarios {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Primer usuario:");
		System.out.print("Nombre: ");
		String name1 = teclado.nextLine();
		System.out.print("Apellidos: ");
		String surname1 = teclado.nextLine();
		System.out.print("Dirección: ");
		String postal1 = teclado.nextLine();

		System.out.println("Segundo usuario:");
		System.out.print("Nombre: ");
		String name2 = teclado.nextLine();
		System.out.print("Apellidos: ");
		String surname2 = teclado.nextLine();
		System.out.print("Dirección: ");
		String postal2 = teclado.nextLine();
		
		System.out.println("Tercer usuario:");
		System.out.print("Nombre: ");
		String name3 = teclado.nextLine();
		System.out.print("Apellidos: ");
		String surname3 = teclado.nextLine();
		System.out.print("Dirección: ");
		String postal3 = teclado.nextLine();

		System.out.println("Tercer usuario:\n Nombre: " + name1 + " Apellido/s: " + surname1 + " Dirección: " + postal1 + ".");
		System.out.println("Segundo usuario:\n Nombre: " + name2 + " Apellido/s: " + surname2 + " Dirección: " + postal2 + ".");
		System.out.println("Primer usuario:\n Nombre: " + name3 + " Apellido/s: " + surname3 + " Dirección: " + postal3 + ".");

	teclado.close();
	}
}