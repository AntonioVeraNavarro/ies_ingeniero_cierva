/**
 * Supuesto1_3.java
 * El programa pide un numero con decimal y luego dependiendo de la condición que cumpla muestra algo por consola.
 * Antonio Vera Navarro 08/10/25
 */


import java.util.Scanner;
// import java.lang.Math; no es necesario importarlo ya que Math es parte de java.lang y este se importa automaticamente pero yo lo puse en el examen por si acaso
public class Supuesto1_3 {
    public static void main(String args[]) {     
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un número con decimales: ");
        Double num = Double.parseDouble(teclado.nextLine());

        // se que algunos parentesis sobran pero para mi es mejor si todo va con parentesis

        if (num >= 1 && num <= 4){
        	System.out.println("EL numero " + num + " menos su 10% es: " + (num - ((num * 10) /100)));
        } else if (num >= 5 && num <= 10){
        	System.out.println("El numero " + num + " por 2 es: " + (num * 2));
        } else if (num > 10 && num < 20){
        	System.out.println("EL numero " + num + " mas el valor de su parte entera es: " + (num + Math.floor(num)));
        } else if (num >= 25 && num < 30){
        	System.out.println("El numero " + num + "multiplicado por el númeri Pi es: " + (num * 3.14));
        } else {
        	System.out.println("El numero " + num + " entre 10 es: " + (num / 10));
        }
    }
}