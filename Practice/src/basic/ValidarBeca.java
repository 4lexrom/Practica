package basic;

import java.util.Scanner;

/*
 * M4 EJERCICIO 3
Una escuela de idiomas concede becas a futuros estudiantes si cumplen con una serie de requisitos.

Al alumno/a se le asigna una beca si es mayor de edad y si tiene un título universitario.
O también se le asigna una beca si el alumno/a está en paro. 
El programa pide los tres datos por pantalla y al finalizar muestra si el alumno/a tiene o no la beca.
*/

public class ValidarBeca {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int edad;
		String tituloUni;
		String paro = "No";

		System.out.print("Edad: ");
		edad = entrada.nextInt();
		System.out.print("¿Tienes titulo universitario?: ");
		tituloUni = entrada.next();

		System.out.print("¿Estas en paro?: ");
		paro = entrada.next();

		if ((edad >= 18 && tituloUni.equalsIgnoreCase("SI")) || (paro.equalsIgnoreCase("SI"))) {
			System.out.println("Tienes la beca!!!");
		} else {
			System.out.println("No tienes la beca");
		}
	}
} 