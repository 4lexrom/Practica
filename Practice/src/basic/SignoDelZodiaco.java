package basic;

import java.util.Scanner;

/*
 * M4 EJERCICIO 6
 * Hacer un programa que solicite al usuario qué día y qué mes nació, con esta información el programa muestra por pantalla, 
 * de qué signo del zodiaco es.
 * 
 */

public class SignoDelZodiaco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int dia;
		int mes;

		System.out.print("¿Que dia naciste? ");
		dia = entrada.nextInt();

		System.out.print("¿En que mes naciste? ");
		mes = entrada.nextInt();

		if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12)) {
			switch (mes) {
			case 1:
				if (dia >= 20) {
					System.out.println("Acuario");
				} else {
					System.out.println("Capricornio");
				}
				break;
			case 2:
				if (dia >= 19) {
					System.out.println("Piscis");
				} else {
					System.out.println("Acuario");
				}
				break;
			case 3:
				if (dia >= 21) {
					System.out.println("Aries");
				} else {
					System.out.println("Piscis");
				}
				break;
			case 4:
				if (dia >= 20) {
					System.out.println("Tauro");
				} else {
					System.out.println("Aries");
				}
				break;
			case 5:
				if (dia >= 21) {
					System.out.println("Geminis");
				} else {
					System.out.println("Tauro");
				}
				break;
			case 6:
				if (dia >= 21) {
					System.out.println("Cancer");
				} else {
					System.out.println("Geminis");
				}
				break;
			case 7:
				if (dia >= 23) {
					System.out.println("Leo");
				} else {
					System.out.println("Cancer");
				}
				break;
			case 8:
				if (dia >= 23) {
					System.out.println("Virgo");
				} else {
					System.out.println("Cancer");
				}
				break;
			case 9:
				if (dia >= 23) {
					System.out.println("Libra");
				} else {
					System.out.println("Virgo");
				}
				break;
			case 10:
				if (dia >= 23) {
					System.out.println("Escorpio");
				} else {
					System.out.println("Libra");
				}
				break;
			case 11:
				if (dia >= 22) {
					System.out.println("Sagitario");
				} else {
					System.out.println("Escorpio");
				}
				break;
			case 12:
				if (dia >= 20) {
					System.out.println("Acuario");
				} else {
					System.out.println("Capricornio");
				}
				break;

			default:
				System.out.println("¡Error! No existe el mes " + mes + " en el calendario");
				break;
			}
		} else {
			System.out.println("¡Error! No existe el dia " + dia + " en el calendario");
		}
	}
}