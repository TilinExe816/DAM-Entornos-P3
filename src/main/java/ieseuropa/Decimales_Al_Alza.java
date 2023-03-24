package main.java.ieseuropa;

public class Decimales_Al_Alza {

	public static double redondearArriba(double dato) {
		return Math.ceil(dato);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------------> Decimales Redondear el número al alza");
		System.out.println(redondearArriba(3.1415));
		System.out.println(redondearArriba(1.4563));
		System.out.println(redondearArriba(87.5555));
		
	}

}
