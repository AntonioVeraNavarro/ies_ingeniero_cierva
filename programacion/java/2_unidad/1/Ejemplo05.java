public class Ejemplo05 {
	public static void main(String[] args) {
		// Declarar un array de enteros
		int[] numeros = {4, 5, 9, 7, 0, 3}; //Longitud 6

		System.out.println("Cantidad de elementos: " + numeros.length);
		//Condiciones iguales
		// i <= numeros.legth-1
		// i = numeros.legth

		for(int i = 0; i < numeros.length; i++) { // i <= numeros.length -1
			System.out.println(numeros[i]);
		}


	}
}

