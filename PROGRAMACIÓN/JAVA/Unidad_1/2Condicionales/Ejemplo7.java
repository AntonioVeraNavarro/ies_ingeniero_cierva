import java.util.Scanner;
public class Ejemplo7{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

			System.out.println("Introduce un dia de la semana para ver que tienes que hacer: ");

			String dia = teclado.nextLine().trim();

			if (dia.equalsIgnoreCase("lunes")){

				System.out.println("IPE, Digitalizacion, Sistemas y Programacion");
			}
			else if (dia.equalsIgnoreCase("martes")){

				System.out.println("Leng. de marcas, Ingles y Sistemas ");
			}
			else if (dia.equalsIgnoreCase("miercoles")){

				System.out.println("IPE, Programacion e Ingles ");
			}
			else if (dia.equalsIgnoreCase("jueves")){

				System.out.println(" Bases de datos y Entornos");
			}
			else if (dia.equalsIgnoreCase("viernes")){

				System.out.println("Programacion, Leng. de marcas y Bases de datos ");
			}
			else if (dia.equalsIgnoreCase("sabado")|| dia.equalsIgnoreCase("domingo")){

				System.out.println("Na de na");
			}
			else{
				System.out.println("No es un dia o esta mal escrito.");
			}


	}
}