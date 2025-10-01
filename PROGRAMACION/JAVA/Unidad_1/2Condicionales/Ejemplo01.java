public class Ejemplo01{
	public static void main(String[] args){
		boolean valor1 = true;
		boolean valor2 = true;

		if (valor1){

			System.out.println("Se cumple la primera condicion");
		}

		if (valor2 && !valor1){

			System.out.println("Se cumple la segunda condicion");
		}

		System.out.println("Fin de programa");

	}
}