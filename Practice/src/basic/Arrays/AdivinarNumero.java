package basic.Arrays;

import java.util.Scanner;

/*
 * M5 EJERCICIO 3
 * Esta línea de código: Math.ceil((Math.random() * 10)); 
 * Devuelve un número entre el 1 y el 10 de forma aleatoria.
 * El ejercicio consiste en que el usuario/a debe adivinar el número escogido aleatoriamente por el programa.
 * El programa, pide números al usuario/a hasta que éste acierte el número aleatorio generado por el programa.
 * Una vez el usuario/a ha adivinado el número, se mostrará por pantalla el siguiente mensaje: “Enhorabuena, el número era X”
 * */

public class AdivinarNumero {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numeroUsu = 0;
		int numeroAuto;

		numeroAuto = (int) Math.ceil((Math.random() * 10));

		while (numeroUsu != numeroAuto) {
			System.out.print("Ingresa un numero: ");
			numeroUsu = entrada.nextInt();

			if (numeroUsu == numeroAuto) {
				System.out.println("Enhorabuena, el número era " + numeroUsu + "!");
			}
		}
	}
}