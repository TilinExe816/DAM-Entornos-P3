package main.java.ieseuropa;

public class Array {

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

	}
}
