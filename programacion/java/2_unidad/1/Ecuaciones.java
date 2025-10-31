import java.util.Scanner;

public class Ecuaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        try {
            System.out.print("Introduce a: ");
            a = sc.nextDouble();
            System.out.print("Introduce b: ");
            b = sc.nextDouble();
            System.out.print("Introduce c: ");
            c = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Entrada inválida. Usa números (ej: 1).\nSaliendo.");
            sc.close();
            return;
        }

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {

            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {

            double raiz = -b / (2 * a);
            System.out.println("La solución es: " + raiz);
        } else {

            System.out.println("No hay soluciones reales.");
        }

        sc.close();
    }
}