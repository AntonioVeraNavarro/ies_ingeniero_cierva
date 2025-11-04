import java.util.Scanner;
public class TrianguloCentradoLleno {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Introduce la altura del triángulo: ");
        int altura = Integer.parseInt(kb.nextLine());
        
        String texto = "\n";
        
        for (int i = 0; i < altura; i++) {
            
        	for (int j = 0; j < ((altura * 2) - 1); j++) {

                if (j < (altura - i - 1) || j > (altura + i - 1)) {

                    texto += "  ";
                } else {
                    texto += "* ";
                }
            }
            texto += "\n";
        }
        System.out.println(texto);
    }
}