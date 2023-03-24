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

	private static boolean armstrong(int num) {
		String numCadena = Integer.toString(num);
		int numDigitos = numCadena.length();
		double suma = 0;
		for (int i = 0; i < numDigitos; i++) {
			int cifra = Character.getNumericValue(numCadena.charAt(i));
			double potencia = Math.pow(cifra, numDigitos);
			suma += potencia;
		}
		if (suma == num) {
			return true;
		} else {
			return false;
		}
	}
	private static ArrayList<Integer> seriePell() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
		lista.add(1);
		for (int i = 2; i < 15; i++) {
			int nuevo = lista.get(i - 2) + (lista.get(i - 1) * 2);
			lista.add(nuevo);
		}
		return lista;
	}
	
	private static String calcularHora(int num) {
		int horas = num / 3600;
		int segundos = num % 3600;
		int minutos = segundos / 60;
		segundos = segundos % 60;
		String hora = String.valueOf(horas + "hs ").concat(String.valueOf(minutos + "mins "))
				.concat(segundos + "segs ");
		return hora;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcularFactorial(12));
		System.out.println(numeroSuerte(34));
		System.out.println(esPrimo(6));
		
		int arms = 153;
		System.out.println(armstrong(arms));
		
		ArrayList<Integer> prueba = seriePell();
		for (int i = 0; i < prueba.size(); i++) {
			System.out.println(prueba.get(i));
		}
		
		System.out.println(calcularHora(9000));
	}

}
