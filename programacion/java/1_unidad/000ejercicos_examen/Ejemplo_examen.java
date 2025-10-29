import java.util.Scanner;
public class Ejemplo_examen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
	
	System.out.print("Introduce un número: ");
	int num1 = Integer.parseInt(teclado.nextLine());
	
	if (num1 >= 0){
		System.out.println("Es positivo");
	}else {
		System.out.println("Es negativo");
	}
	
	
	System.out.print("Dame un texto: ");
	String text1 = teclado.nextLine();

    String tex1lower = text1.toLowerCase();
    String tex1upper = text1.toUpperCase();

    System.out.println("El texto en minusculas es: " + tex1lower);
    System.out.println("El texto en mayusculas es: " + tex1upper);

    System.out.print("Dame un texto: ");
	String text2 = teclado.nextLine().trim(); // .trim quita espacios al principio y al final
	
	
	System.out.println(text2);
	
	if (text2.equalsIgnoreCase("hola")){
		System.out.println("El texto esta en minusculas");
	}else if (text2.equalsIgnoreCase("ADIOS")){
		System.out.println("El texto esta en mayusculas");
	}

	// TIPOS DE DATOS
	// int = entero
	// double = decimal
	// String = cadena de texto
	// boolean = true/false

	


	// OPERADORES LOGICOS
	// "Y" = "&&"
	// "O" = "||"
	// "NO" = "!"
	// "==" = igualdad
	// "!=" = distinto
	// "porcentaje" = "%"
	
	teclado.close();
    }
}
