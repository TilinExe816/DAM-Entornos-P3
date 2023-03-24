package main.java.ieseuropa;

public class Decimales {

	public static double segundoGrado(double a, double b, double c) {
		return (-b + Math.sqrt((b*b) - (4*a*c)) )/ 2*a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----------------> ejecutar la ecuación de segundo grado ");
		System.out.println(segundoGrado(1, -2, 1));
		System.out.println(segundoGrado(1, -4, 4));
		System.out.println(segundoGrado(-1, 4, -4));
	}

}
