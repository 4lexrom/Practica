package basic.m7_3;

/*M 7.3 EJERCICIO 5*/

import java.util.Scanner;

public class FraseMayusMinusOAmbas {

	public static void main(String[] args) {

		System.out.print("Ingresar frase: ");
		validarMayusMinus(ingresarPalabra());

	}

	public static String ingresarPalabra() {
		Scanner entrada = new Scanner(System.in);
		String texto;
		texto = entrada.nextLine();
		return texto;
	}

	public static void validarMayusMinus(String texto) {
		boolean mayus = false;
		boolean minus = false;

		for (int i = 0; i <= texto.length() - 1; i++) {
			mayus = Character.isUpperCase(texto.charAt(i));
			minus = Character.isLowerCase(texto.charAt(i));
		}
		if (mayus) {
			System.out.println("La frase esta formada solo por Mayusculas");
		} else if (minus) {
			System.out.println("La frase esta formada solo por Minusculas");
		} else {
			System.out.println("La frase esta formada por Mayusculas y Minusculas");
		}
	}
}