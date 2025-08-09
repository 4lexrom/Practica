package basic;

import java.util.Scanner;

/*
 * M3 EJERCICIO EXTRA III
Escribe un programa Java que calcule los litros de pintura necesarios para pintar una pared
rectangular.

Un litro de pintura cubre aproximadamente, 12 m2 en una sola mano.

Crea una constante llamada coberturaLitro para guardar el dato de cobertura de la pintura (12 m²)
Deberás pedir al usuario:

- El alto y ancho de la pared (multiplicante sabrás el área de la misma)
- El número de manos a aplicar.
Muestra en pantalla los litros de pintura a utilizar.
*/

public class CalcularLitros {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int coberturaLitro = 12;
		double altura;
		double ancho;
		double area;
		double litros;
		double totalLitros;
		double cantManos;

		System.out.print("Ingresa altura de la pared: ");
		altura = entrada.nextDouble();
		System.out.print("Ingresa ancho de la pared: ");
		ancho = entrada.nextDouble();
		System.out.print("¿Cuantas manos va aplicar?: ");
		cantManos = entrada.nextDouble();

		area = ancho * altura;
		litros = area / coberturaLitro;
		totalLitros = litros * cantManos;

		System.out.println("Para pintar un area de " + (int) area + "M2 aplicando " + (int) cantManos
				+ " manos, son necesarios " + (int) totalLitros + " litros");
	}
}