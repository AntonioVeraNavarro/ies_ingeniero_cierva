// Escribe un programa simple que pida un número entero y a partir de él cree en pantalla de texto un cuadrado de asteriscos con ese tamaño de lado.
import java.util.Scanner;
public class CuadradoLleno {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Introduce el tamaño del lado del cuadrado: ");
        int lado = Integer.parseInt(kb.nextLine());

        String texto = "\n";

        for (int i = 0; i < lado; i++) {
            texto += "* ".repeat(lado) + "\n";
        }
        System.out.println(texto);
        kb.close();
    }
}
