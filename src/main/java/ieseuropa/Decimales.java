package main.java.ieseuropa;

public class Decimales {

	public static double eliminarDecimales(double dato) {
		return (int) dato;
	}
	
	public static double segundoGrado(double a, double b, double c) {
		return (-b + Math.sqrt((b*b) - (4*a*c)) )/ 2*a;
	}
	
	public static double redondearArriba(double dato) {
		return Math.ceil(dato);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------------> Decimales Redondear el número al alza");
		System.out.println(redondearArriba(3.1415));
		System.out.println(redondearArriba(1.4563));
		System.out.println(redondearArriba(87.5555));
		
    
    System.out.println("-----------------> ejecutar la ecuación de segundo grado ");
		System.out.println(segundoGrado(1, -2, 1));
		System.out.println(segundoGrado(1, -4, 4));
		System.out.println(segundoGrado(-1, 4, -4));
    
    System.out.println("-----------------> Eliminar decimales numero");
		System.out.println(eliminarDecimales(3.1415));
		System.out.println(eliminarDecimales(1.4563));
		System.out.println(eliminarDecimales(87.5555));

	}

}
