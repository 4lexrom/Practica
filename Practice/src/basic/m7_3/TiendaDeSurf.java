package basic.m7_3;

import java.util.Scanner;

/*7.3 EJERCICIO 6*/

public class TiendaDeSurf {

	public static void main(String[] args) {

		opciones(menu());
	}

	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int numero;
		numero = entrada.nextInt();
		return numero;
	}

	public static String pedirTexto() {
		Scanner entrada = new Scanner(System.in);
		String texto = entrada.nextLine();
		return texto;
	}

	public static int menu() {
		System.out.println("1. Tipo de tabla\n" + "2. Tamaño de las olas\n" + "3. Costo poor reserva\n"
				+ "4. Salir del programa\n");

		System.out.print("Elije una opcion: ");
		int opcion = pedirNumero();

		return opcion;
	}

	public static void opciones(int opcion) {
		boolean experiencia = false;

		switch (opcion) {
		case 1:
			experiencia = validarExperiencia();
			calcularMaterialTabla(experiencia);
		case 2:
			System.out.print("Altura de las olas: ");
			int altura = pedirNumero();
			calcularAlturaOlas(altura);
		case 3:
			calcularCostePorReserva(experiencia);
		case 4:
			if (opcion == 4) {
				System.out.println("Se ha cerrado el programa...");
				System.exit(0);
			} else {
				System.out.println();
				opciones(menu());
			}
		}
	}

	public static void calcularMaterialTabla(boolean experiencia) {
		if (experiencia == true) {
			System.out.println("Tabla de fibra");
		} else {
			System.out.println("Tabla de espuma");
		}
	}

	public static void calcularAlturaOlas(int alturaOlas) {
		if (alturaOlas >= 2) {
			System.out.println("Oleadas grandes");
		} else {
			System.out.println("Oleadas pequeñas");
		}
	}

	public static void calcularCostePorReserva(boolean experiencia) {
		final double MINUTOS = 60;
		double reservaMinutos;
		double precioIntermedio = 35;
		double precioIniciacion = 20;

		System.out.print("Cuantos minutos vas a reservar: ");
		int minutos = pedirNumero();

		reservaMinutos = minutos / MINUTOS;

		if (experiencia == true) {
			System.out.println("El coste de tu reserva es de: " + (precioIntermedio * reservaMinutos));
		} else {
			System.out.println("El coste de tu reserva es de: " + (precioIniciacion * reservaMinutos));
		}
	}

	public static boolean validarExperiencia() {
		boolean experiencia;
		String practicaSurf;

		System.out.print("Tienes experiencia en surf? ");
		practicaSurf = pedirTexto();

		if (practicaSurf.equalsIgnoreCase("Si")) {
			experiencia = true;
		} else {
			experiencia = false;
		}
		return experiencia;
	}
}