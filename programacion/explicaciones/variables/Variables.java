public class Variables{
    public static void main(String[] args){
        /*
         * Una variable es un dato que se almacena en memoria y contiene cierto valor
         * Este valor puede ir cambiando a lo largo del programa
         * Cada variable tiene un tipo de dato, y no se puede cambiar a lo largo del programa
         */


        // DECLARACIÓN DE UNA VARIABLE
        // TIPO nombreVariable = VALOR;
        
        // VARIABLES DE TEXTO
        //   Declaración STRING: Las variables String son cadenas de carácteres, un texto comunmente llamado
        String nombreVariable = "valorVariable"; // Los String pueden ir con comillas simples o dobles
        //   Declaración de char: Las variables Char solo contienen un carácter
        char caracterVariable = 'e'; // Los Char van con comillas simples

        // VARIABLES DE NÚMEROS
        //   Declaración Enteros (INT): Son números enteros, tanto positivos como negativos
        int numeroEntero = 1;
        //   Declaración Decimales (DOUBLE): Son números con decimales, se separan con un .
        double numeroDecimal = 3.14;

        // VARIABLES LÓGICAS
        //   Declaración BOOL: Esta variable solo admite true o false como valores. 
        Boolean variableBool = true;

        // OPERACIONES ARITMETICAS
        // + -> Suma | [CON STRINGS] Concatenación de cadenas de carácteres. 
        // - -> Resta
        // * -> Mutiplicación
        // / -> División
        // % -> Módulo (Resto de una división)

        // OPERACIONES LÓGICAS
        // && -> AND
        // || -> OR
        // ! -> NOT

        // COMPARADORES
        // < -> Menor que
        // > -> Mayor que
        // <= -> Menor o igual que
        // >= -> Mayor o igual que
        // != -> No igual a

        // Imprimir por pantalla todos estos datos
        System.out.println(nombreVariable);
        System.out.println(caracterVariable);
        System.out.println(numeroEntero);
        System.out.println(numeroDecimal);
        System.out.println(variableBool);

    }
}