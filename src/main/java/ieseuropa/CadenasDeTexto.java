package main.java.ieseuropa;

public class CadenasDeTexto {
	
	private static int ocurrenciasLetra(String texto, char letra) {
		int cont = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == letra) {
				cont++;
			}
		}
		return cont;
	}
	
	private static String textoMinuscula(String texto) {
		return texto.toLowerCase();
	}

	private static String textoMayuscula(String texto) {
		return texto.toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Hola soy Diego";
		System.out.println(ocurrenciasLetra(texto,'o'));
		System.out.println(textoMinuscula(texto));
		System.out.println(textoMayuscula(texto));
	}

}
