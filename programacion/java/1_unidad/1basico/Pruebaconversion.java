public class Pruebaconversion{
	public static void main (String[] args){

		int num1 = 100;
		double num2 = 2345.45;
		byte num3 = (byte) num1;
		int num4 = (int) num2;
		int num5 = (int)3456.556f;


		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("num2 convertido a entero es: " + num4);
		System.out.println("un float convertido a byte es: " + num5);


	}
}