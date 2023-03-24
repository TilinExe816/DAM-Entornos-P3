package main.java.ieseuropa;

public class Array {

	public static int[] arrayMenorAMayor(int[] datos) {
		for (int i = 0; i < datos.length - 1; i++) {
			for (int j = 0; j < datos.length - i - 1; j++) {
				if (datos[j] > datos[j + 1]) {
					int temp = datos[j];
					datos[j] = datos[j + 1];
					datos[j + 1] = temp;
				}
			}
		}
		return datos;
	}
	public static float mediana (int[] datos) {
		int [] ordenada= arrayMenorAMayor(datos);
		float mediana;
		if(ordenada.length%2!=0) {
			mediana=ordenada[ordenada.length/2];
		}
		else {
			float m1=ordenada[ordenada.length/2];
			System.out.println(m1);
			float m2=ordenada[ordenada.length/2-1];
			System.out.println(m2);
			mediana=(m1+m2)/2;
		}
		return mediana;
	}
	public static void main(String[] args) {
		int[] test = { 1, 43, 5, 23, 7, 3, 6, 78};
		test = arrayMenorAMayor(test);
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println(mediana(test));
	} 
}

