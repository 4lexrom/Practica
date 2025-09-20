package poo.m8.ejercicio6;

import java.util.Scanner;

public class MetodoPrincipal {
	static Scanner entrada = new Scanner(System.in);
	static Gestor gestor = new Gestor();

	public static void main(String[] args) {

	}

	public static void menu() {
		System.out.println("1. Gestionar personas.");
		System.out.println("2. Gestionar Mecanicos.");
		System.out.println("3. Gestionar Pilotos.");
		System.out.println("4. Gestionar Escuderias.");
		System.out.println("5. Gestionar Vehiculos.");
		System.out.println("0. Salir de programa.");
	}

	public static int subMenu() {
		System.out.println("1. Crear.");
		System.out.println("2. Ver todo.");
		System.out.println("3. Buscar.");
		System.out.println("4. Actualizar.");
		System.out.println("5. Eliminar.");

		System.out.print("Elije la accion a realizar: ");
		int opcion = entrada.nextInt();
		return opcion;
	}

	public static void opciones() {
		int opcion;
		boolean salir = false;

		while (!salir) {
			System.out.print("Elije una opcion: ");
			opcion = entrada.nextInt();

			System.out.println("\tSeleciona la accion que deseas realizar");

			switch (opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:

				break;
			case 5:

				break;
			case 0:
				salir = true;
				System.out.println("Programa finalizado");
				break;
			default:
				System.err.println("¡La opcion ingresada no es valida!");
				break;
			}
		}
	}
}