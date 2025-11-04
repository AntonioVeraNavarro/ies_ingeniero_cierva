// Programa que dibuja un triángulo lleno por pantalla utilizando asteriscos (*).
import java.util.Scanner;
public class TrianguloLleno {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Introduce la altura del triángulo: ");
        int altura = Integer.parseInt(kb.nextLine());

        String texto ="\n";
        for (int i = 1; i <= altura; i++) {
            texto += "* ".repeat(i) + "\n";
        }
        System.out.println(texto);
        
        kb.close();
    }
}
