package basic.m7_3;

/*M 7.3 EJERCICIO 2*/

import java.util.Scanner;

public class StrinngAlReves {

	public static void main(String[] args) {
		System.out.print("Ingresar palabra: ");
		invertirOrdenDePalabra(ingresarPalabra());
	}

	public static String ingresarPalabra() {
		Scanner entrada = new Scanner(System.in);
		String texto;
		texto = entrada.next();
		return texto;
	}

	public static void invertirOrdenDePalabra(String texto) {
		for (int i = texto.length() - 1; i >= 0; i--) {
			System.out.print(texto.charAt(i));
		}
	}
}