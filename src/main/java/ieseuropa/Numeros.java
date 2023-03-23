package main.java.ieseuropa;

import java.util.ArrayList;

public class Numeros {
	
	private static int calcularFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
	
	private static String numeroSuerte(int numero) {
		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i=1;i<=numero;i++) {
			numeros.add(i);
		}
		numeros.removeIf(n -> (n%2 == 0));
		int pos = 1;
		while(pos < numeros.size()) {
			int n = numeros.get(pos);
			for(int i=n-1;i<numeros.size();i+=n-1) {
				numeros.remove(i);
			}
			pos++;
		}
		if(numeros.contains(numero))
			return numero + " es un numero de la suerte";
		else
			return numero + " no es un numero de la suerte";
	}
	
	private static String esPrimo(int numero) {
		boolean esPrimo = true;
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				esPrimo = false;
			}
		}
		if (esPrimo == true)
			return numero + " es un numero primo";
		else
			return numero + " no es un numero primo";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcularFactorial(12));
		System.out.println(numeroSuerte(34));
		System.out.println(esPrimo(6));
	}

}
