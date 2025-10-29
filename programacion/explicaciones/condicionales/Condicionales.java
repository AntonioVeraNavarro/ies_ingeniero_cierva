package condicionales;

public class Condicionales {
    public static void main(String[] args){
        // Las estructuras condicionales nos permiten ejecutar ciertas sentencias
        // en base si la condición se cumple o no, y de esta manera manipular
        // el flujo del programa, por eso también se llaman Estructuras del control del flujo

        // SINTAXIS
        /*  if(condicion){
                // Código a ejecutar si se cumple la condición
            }
            else if(condicion2){
                // Código a ejecutar si se cumple la segunda condicion, pero no la anterior
            }
            else{
                // Código a ejecutar si no se cumple ninguna condición
            }
        */

        // En este primer caso lo que saldría por la consola al ejecutarse será "El numero es exactamente igual a 15"
        // ya que no se cumple la primera condición pero si la segunda
        int numero = 15;
        if(numero != 15){
            System.out.println("El número no es igual a 15");
        }
        else if(numero == 15){
            System.out.println("El número es exactamente igual a 15");
        }
        else{
            System.out.println("Esto es solo si no se cumple ninguna anterior");
        }
        // En este segundo caso lo que saldría por la consola al ejecutarse será "Has sacado un sobresaliente, felicidades"
        // ya que se cumple la segunda condicion
        int calificacion = 9;
        if(calificacion < 8){
            System.out.println("No has sacado un sobresaliente");
        }
        else if(calificacion < 8){
            System.out.println("Has sacado un sobresaliente, felicidades");
        }
        else{
            System.out.println("Esto es solo si no se cumple ninguna anterior");
        }
        // En este tercer caso lo que saldría por la consola al ejecutarse será "Esto es solo si no se cumple ninguna anterior"
        // ya que no se cumple ni la primera ni la segunda condición
        int numero2 = 105;
        if(numero2 == 15){
            System.out.println("El número no es igual a 15");
        }
        else if(numero2 == 15){
            System.out.println("El número es exactamente igual a 15");
        }
        else{
            System.out.println("Esto es solo si no se cumple ninguna anterior");
        }
        
    }
}
