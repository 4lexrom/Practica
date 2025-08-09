package basic.metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class EdadMedia {

	public static void main(String[] args) {

		System.out.println("La media de edades es: " + calcularMedia(pedirEdad(cantidadEdad())));

	}

	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int numero;
		numero = entrada.nextInt();
		return numero;
	}

	public static int cantidadEdad() {
		System.out.print("¿Cuantas edades quieres calcular? ");
		int cantEdad = pedirNumero();
		return cantEdad;
	}

	public static ArrayList<Integer> pedirEdad(int totalEdades) {
		ArrayList<Integer> lstEdades = new ArrayList<Integer>();
		int edad;

		for (int i = 0; i < totalEdades; i++) {
			System.out.print("Ingresa edad: ");
			edad = pedirNumero();
			validarEdad(edad);
			lstEdades.add(edad);
		}
		return lstEdades;
	}

	public static double calcularMedia(ArrayList<Integer> lstEdades) {
		double suma = 0;
		double media;
		for (int i = 0; i < lstEdades.size(); i++) {
			suma += lstEdades.get(i);
		}
		media = suma / lstEdades.size();
		return media;
	}

	public static void validarEdad(int edad) {
		if (edad >= 0 && edad <= 120) {
			
		} else {
			System.out.println("Edad " + edad + " fuera de rango, ¡Adios!");
			System.exit(0);
		}
	}
}