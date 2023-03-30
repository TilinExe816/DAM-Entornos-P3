package main.java.ieseuropa;

public class Array {
	
	private static int calcularMax(int[] array) {
		int max = Integer.MIN_VALUE;
		for(int num:array) {
			if(num > max)
				max = num;
		}
		return max;
	}

	private static int calcularMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int num:array) {
			if(num < min)
				min = num;
		}
		return min;
	}


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

	

	private static double calcularMedia(int[] array) {

		double media = 0.0;

		for (int i = 0; i < array.length; i++) {
			media = media + array[i];
		}

		media = media / array.length;

		return media;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		int[] array = {458,6,68,4796,6341,31,46};
		System.out.println(calcularMax(array));
		System.out.println(calcularMin(array));
		System.out.println(calcularMedia(array));

		int[] test = { 1, 43, 5, 23, 7, 3, 6, 78};
		test = arrayMenorAMayor(test);
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println(mediana(test));
	}

	
}
