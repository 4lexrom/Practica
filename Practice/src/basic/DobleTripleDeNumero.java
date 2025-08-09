package basic;

import java.util.Scanner;

/*
 * M3 EJERCICIO EXTRA I
 * Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por 
 * pantalla el doble y el triple de ese número.*/

public class DobleTripleDeNumero {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		int doble;
		int triple;

		System.out.print("Ingresa un numero: ");
		numero = entrada.nextInt();

		if (numero > 0) {
			doble = numero * 2;
			triple = numero * 3;

			System.out.println("Doble: " + doble);
			System.out.println("Triple: " + triple);
		}

	}
}