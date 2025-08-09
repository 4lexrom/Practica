package basic.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/* M5 EJERCICIO 1
 * El programa pide cuántas palabras quiere introducir el usuario/a. Éste, introduce el número y entonces aparece el siguiente
 *  mensaje: "Introduce la palabra".
 *	Este mensaje se muestra tantas veces como número de palabras ha dicho el usuario que quería introducir. 
 *	Las palabras se guardan en un arrayList y una vez que han sido todas introducidas , se muestran por pantalla.
 * */

public class PedirPalbras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int cantPalabras;
		String palabra;

		ArrayList<String> lstPalabras = new ArrayList<String>();

		System.out.print("Ingresa la cantidad de palabras: ");
		cantPalabras = entrada.nextInt();

		for (int i = 0; i < cantPalabras; i++) {
			System.out.print("Ingresa una palabra: ");
			palabra = entrada.next();
			lstPalabras.add(palabra);
		}

		System.out.println("Las palabras ingresadas son:");
		for (int i = 0; i < lstPalabras.size(); i++) {
			System.out.println((i + 1) + ". " + lstPalabras.get(i));
		}
	}
}