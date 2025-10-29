package bucles;

public class Bucles {
    public static void main(String[] args) {
        // Los bucles nos permiten ejecutar código de manera repetitiva
        // por eso también se pueden llamar estructuras de repetición
        // pero cada uno es usado de una manera distinta, aqui explico todos

        // BUCLE FOR
        // El bucle For es usado cuando tenemos claro las iteraciones (nº de vueltas) que vamos a dar al bucle
        // SINTAXIS
        /*  
            for(DECLARACION CONTADOR; CONDICION; COMPORTAMIENTO CONTADOR ){
                // Código a ejecutar
            }
        */
        // EJEMPLO
        // Este bucle se ejecutará 5 veces, la variable contador tiene de nombre "i" y en cada vuelta sumará 1 (por el i++) 
        for(int i = 0; i < 5; i++){
            System.out.println("Hola a todos | " + i);
        }
        System.out.println("--------------------------------------");
        // BUCLE WHILE
        // El bucle While es usado cuando queremos que algo se repita hasta que se cumpla la condición especificada
        // SINTAXIS
        /*  
            while(condicion){
                // Código a ejecutar
            }
        */
        // EJEMPLO
        // Este bucle se ejecutará 5 veces, usa un contador externo y en cada iteracion se le suma 1 al valor total del contador
        int contador = 0; 
        while(contador != 5){
            contador++;
            System.out.println("El contador va por: " + contador);
        }
        System.out.println("--------------------------------------");
        // BUCLE DO WHILE
        // El bucle Do while es usado exactamente igual que el While pero este se usa cuando necesitamos que mínimo
        // se ejecute una vez. 
        // SINTAXIS
        /*  
            do{
                // Código a ejecutar
            } while(condición)
        
        */
        // EJEMPLO
        // Este bucle sacará por pantalla Antonio y después no se ejecutará de nuevo porque se le ha cambiado el valor antes de mostrarlo. 
        String nombre = "Antonio";
        do{
            nombre = "Pedro";
            System.out.println(nombre);
        }while(nombre.equalsIgnoreCase("Antonio")); 
        System.out.println("--------------------------------------");
        // BUCLE FOR EACH
        // El bucle For Each es usado cuando queremos hacer ciertas acciones sobre arrays. Por ejemplo, mostrar por consola todos sus elementos
        // SINTAXIS
        /*  
            for(variableLocal : arrayElementos){
                // Código a ejecutar
            }
        
        */
        // EJEMPLO
        // Este bucle sacará por pantalla Antonio y después no se ejecutará de nuevo porque se le ha cambiado el valor antes de mostrarlo. 
        String[] cars = {"Volvo", "BMW", "Mercedes", "Seat", "Nissan"};
        for(String car : cars){
            System.out.println(car);
        }
    } 
}
