// Escribe un programa simple que pida un número entero y a partir de él cree en pantalla de texto un cuadrado de asteriscos con ese tamaño de lado.
//Los asteriscos sólo se verán en el borde del cuadrado.
import java.util.Scanner;
public class CuadradoVacio {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Introduce el tamaño del lado del cuadrado: ");
        int lado = Integer.parseInt(kb.nextLine());

        String texto = "\n";

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    texto+="* ";
                } else {
                    texto+="  ";
                }
            }
            texto+="\n";
        }
        System.out.println(texto);
        kb.close();
    }
}
