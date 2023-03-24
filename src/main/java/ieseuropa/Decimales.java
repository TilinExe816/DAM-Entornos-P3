package main.java.ieseuropa;

public class Decimales {

	public static double eliminarDecimales(double dato) {
		return (int) dato;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------------> Eliminar decimales numero");
		System.out.println(eliminarDecimales(3.1415));
		System.out.println(eliminarDecimales(1.4563));
		System.out.println(eliminarDecimales(87.5555));

	}

}
