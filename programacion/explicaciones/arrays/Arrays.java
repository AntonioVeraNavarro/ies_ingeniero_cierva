package arrays;

public class Arrays {
    public static void main(String[] args) {
        // Los array son como una variable que dentro contiene varias variables
        // Aunque esta explicación es muy arcaica, voy a explicarlo mejor

        // Los array son colecciones de datos compuestas por otros datos, es decir
        // son colecciones de datos que dentro contienen muchas variables o datos. 
        // Un ejemplo sería una lista de coches
        String[] arrayCoches = {"Volvo", "BMW", "Lamborghini", "Ferrari"};
        // En este caso la colección ("variable" grande) seria arrayCoches, y 
        // cada uno de los datos que lo componen con las cadenas de texto que hay dentro (cada marca de coches)
        
        // Los array son útiles cuando necesitamos almacenar varias variables correspondientes
        // a una misma categoria, como puede ser en este caso marcas de coches. 
        // Para iterarlos (recorrerlos) se puede usar el bucle for-each visto en el fichero de bucles

        // En este caso se crea una variable local "coche" que toma el valor
        // de cada elemento en el array de nombre "arrayCoches", y lo imprime por pantalla
        for(String coche : arrayCoches){
            System.out.println(coche);
        }
        System.out.println("------------------------------------");

        // La forma de declarar los arrays son 2:
        // PRIMERA FORMA
        // Esta es la que he usado antes para el ejemplo, que es cuando 
        // Sabemos exactamente que datos va a contener el array. Un ejemplo sería este:
        String[] arrayCoches2 = {"Volvo", "BMW", "Lamborghini", "Ferrari"};
        System.out.println(arrayCoches2);
        System.out.println("------------------------------------");

        // SEGUNDA FORMA
        // Esta es la que usaremos cuando sabemos el tamaño del array pero no sabemos
        // los valores de cada posición del array. 
        int[] arrayNumeros = new int[10];
        
        System.out.println(arrayNumeros);
        // En este caso estamos declarando un array que va a tener 10 posiciones
        // cuyo valor se especifica dentro de los corchetes del array. 

        System.out.println("------------------------------------");

        // ACCESO A DATOS DEL ARRAY
        // Ahora que sabemos declarar array, a la hora de acceder a x dato tenemos que
        // Especificar su posición. Vamos a seguir trabajando con el primer array de prueba
        // Las posiciones de los array empiezan desde 0, osea que si tenemos 5 elementos
        // tenemos desde la posicion 0 hasta la posicion 4. Y para acceder a una posición en especifico 
        // la especificamos poniendola entre las llaves junto al nombre del array. Por ejemplo
        System.out.println(arrayCoches[0]);
        // Esto imprimirá la primera posición del arrayCoches. 

        // Una vez un array tenga declarado su número no se le puede modificar el tamaño de este.
    }
}
