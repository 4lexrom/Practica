package basic.m7_1;

import java.util.Scanner;

public class ImprimirFiguraConCaracter {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero;
		char caracter;

		System.out.print("Ingresa un numero: ");
		numero = entrada.nextInt();

		System.out.print("Ingresa un caracter: ");
		caracter = entrada.next().charAt(0);

		for (int i = 0; i < numero; i++) {
			// System.out.print(caracter);
			for (int j = 0; j < numero; j++) {
				System.out.print(caracter + " ");
			}
			System.out.println();
		}
	}
}