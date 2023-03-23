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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		int[] array = {458,6,68,4796,6341,31,46};
		System.out.println(calcularMax(array));
		System.out.println(calcularMin(array));
	}

}
