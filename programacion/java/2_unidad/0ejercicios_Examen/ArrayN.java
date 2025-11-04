import java.util.Scanner;

public class ArrayN {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
	
        System.out.print("¿Cuántos números quieres introducir? Escribe: ");
        int longitud = Integer.parseInt(kb.nextLine());
    
        int[] array = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.print("Introduce el " + (i + 1) + "º número: ");
            array[i] = Integer.parseInt(kb.nextLine());
        }
        String aux = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                aux+= ""+(array[i])+".";
            } else {
                aux+= ""+(array[i])+", ";
            }
            
        }
        System.out.println("Los números introducidos son: " + aux);
    kb.close();
    }
}
