package conversionDatos;

public class ConversionDatos {
    public static void main(String[] args) {
        // Muchas veces a lo largo de nuestros programas nos vamos a ver
        // Con la necesidad de trabajar con muchos tipos de datos, y
        // muchas veces, estos no van a coincidir. Pero para ello podemos
        // hacer conversiones entre datos


        // CONVERSION ENTRE NÚMEROS
        // La conversión entre números consiste en crear una nueva variable
        // con el nuevo tipo al que queramos convertirlo y, antes de asignar el valor
        // poner, entre parentesis, el nuevo tipo de dato. Estos son algunos ejemplos
        int numero = 5;
        double numeroD = 2.4;
        byte ochoa = (byte) numero;
        int numeroE = (int) numeroD;

        System.out.println(numero + " " + numeroD + " " + ochoa + " " + numeroE);

        // CONVERSION DE NÚMERO A STRING
        // Para convertir un número en una variable de tipo String simplemente
        // hay que concatenar un String vacio (representado por las comillas)
        // con el valor de la variable que vamos a representar
        String numeroS = "" + numero;
        System.out.println(numeroS);
    }
}
