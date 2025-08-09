package basic.Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* M5 EJERCICIO 2
 * El programa pide dos números enteros y entonces calcula la suma de los valores comprendidos entre ambos números, incluidos. 
 * Ejemplo: 4 y 10 --> resultado = 4 + 5 + 6 + 7 + 8 + 9 + 10 = 49
 * */

public class CalcularSuma {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero;
		int suma = 0;
		int cont = 0;

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 0; i < 2; i++) {
			System.out.print("Digita un numero: ");
			numero = entrada.nextInt();
			numeros.add(numero);
		}

		for (int i = numeros.get(0) - 1; i < numeros.get(1); i++) {
			suma = i + 1;
			cont += suma;
			System.out.println(cont);
		}
	}
}