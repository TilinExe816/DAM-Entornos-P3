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
	private static String repetirStrings(String cadena1, String cadena2, int rep) {
		String cadenaRep="";
		for(int i=0; i<rep;i++) {
			cadenaRep+=cadena1+"\n"+cadena2+"\n";
		}
		
		return cadenaRep;
	}

	private static String repetirLetras(String texto) {
		String repetido="";
		int repeticiones=2;
		for(int i=0;i<texto.length();i++) {
			for(int j=0;j<repeticiones;j++) {
				repetido+=texto.charAt(i);	
			}
		}
		
		return repetido;
	}
	private static String borrarCadena(String cadena, String borrado) {
		String cadenaFin=cadena.replace(borrado, "");
		
		return cadenaFin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Hola soy Diego";
		System.out.println(ocurrenciasLetra(texto,'o'));
		System.out.println(textoMinuscula(texto));
		System.out.println(textoMayuscula(texto));
		
		System.out.println(repetirStrings("Hola", "Hamijo",3));
		System.out.println(repetirLetras("Rock&Stone4ever"));
		System.out.println(borrarCadena("si si si, creanme que es asi","si"));
	}

}
