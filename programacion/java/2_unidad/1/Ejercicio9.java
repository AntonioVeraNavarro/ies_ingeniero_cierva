public class Ejercicio9 {
    public static void main(String[] args) {

        int[] list1 = {6, 5, 8, 7, 9, 1, 3, 2};
        int[] list2 = {1, 2, 3, 4, 5, 6, 7, 8};

        int cantidad = 0;

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] % 2 == 1) {
                cantidad++;
            }
        }

        for (int i = 0; i < list2.length; i++) {
            if (list2[i] % 2 == 0) {
                cantidad++;
            }
        }

        int[] numero = new int[cantidad];

        int indice = 0;

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] % 2 == 1) {
                numero[indice] = list1[i];
                indice++;
            }
        }

        for (int i = 0; i < list2.length; i++) {
            if (list2[i] % 2 == 0) {
                numero[indice] = list2[i];
                indice++;
            }
        }

        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }

        System.out.println("Fin de programa.");
    }
}