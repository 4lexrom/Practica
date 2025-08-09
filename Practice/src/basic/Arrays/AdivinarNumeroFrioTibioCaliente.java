package basic.Arrays;

import java.util.Scanner;

/*
 * M5 EJERCICIO EXTRA 1
 */

public class AdivinarNumeroFrioTibioCaliente {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numUsuario = 0;
		int numAleatorio;
		int diferencia;
		int distancia;

		numAleatorio = (int) Math.ceil((Math.random() * 500));
		System.out.println(numAleatorio);

		while (numUsuario != numAleatorio) {
			System.out.print("Ingresa un numero: ");
			numUsuario = entrada.nextInt();

			diferencia = numAleatorio - numUsuario;
			distancia = Math.abs(diferencia);// Convierte numero negativo en positivo

			if (distancia >= 50) {
				System.out.println("Frio");
			} else if (distancia >= 15 && distancia < 50) {
				System.out.println("Tibio");
			} else if (distancia >= 1 && distancia < 15) {
				System.out.println("Caliente");
			} else if (numUsuario == numAleatorio) {
				System.out.println("¡Lo adivinaste!");
			}
		}
	}
}