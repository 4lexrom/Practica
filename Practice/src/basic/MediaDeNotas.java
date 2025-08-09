package basic;

import java.util.Scanner;

/*
 * M3 EJERCICIO 3
 * El programa pide al usuario que introduzca 3 notas y el programa muestra la media de las 3 notas
 * por pantalla.	*/

public class MediaDeNotas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int nota;
		double media = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("Ingresar nota " + (i + 1) + ": ");
			nota = entrada.nextInt();
			media += nota;
		}

		System.out.println("La media de la nota es: " + media / 3);

	}

}
