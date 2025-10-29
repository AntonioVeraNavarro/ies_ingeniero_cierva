import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Indica la altura en las líneas del triángulo: ");

        int altura = Integer.parseInt(teclado.nextLine());

        // EL triangulo tendrá un asterisco en su primera linea e incrementará en 1 la cantidad de asteriscos por línea

        String texto = "";
        for(int i = 1; i <= altura; i++) {
            for(int j = 1; j <= i; j++) {
                texto += "*";
            }
            texto += "\n";
        }
        System.out.println(texto);

        System.out.println("\nFin de programa");
    }
}