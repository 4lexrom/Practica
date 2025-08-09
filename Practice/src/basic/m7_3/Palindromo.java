package basic.m7_3;

/*M 7.3 EJERCICIO 3*/

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		System.out.print("Ingresar palabra: ");
		System.out.println(esPalindromo(ingresarPalabra()));
	}

	public static String ingresarPalabra() {
		Scanner entrada = new Scanner(System.in);
		String texto;
		texto = entrada.nextLine();
		return texto;
	}

	public static boolean esPalindromo(String texto) {
		int a = 0;
		int b = texto.length() - 1;
		texto = texto.toLowerCase(); // Convertir mayusculas a minusculas
		texto = texto.replace(" ", ""); // Eliminar espacios entre palabras
		texto = texto.replace("á", "a"); // Eliminar las tildes
		texto = texto.replace("é", "e");
		texto = texto.replace("í", "i");
		texto = texto.replace("ó", "o");
		texto = texto.replace("ú", "u");

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(a) == texto.charAt(b)) {
				a++;
				b--;
			} else {
				return false;
			}
		}
		return true;
	}
}