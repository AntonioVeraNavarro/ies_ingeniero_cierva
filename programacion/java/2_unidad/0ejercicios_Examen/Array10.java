import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        //array de 10 numeros
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el " + (i + 1) + "º número: ");
            numeros[i] = Integer.parseInt(kb.nextLine());
        }

        String aux = "";
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                aux+= ""+(numeros[i])+".";
            } else {
                aux+= ""+(numeros[i])+", ";
            }
            
        }
        System.out.println("Los números introducidos son: " + aux);
        kb.close();
    }
}
