package basic.m7_3;

/*M 7.3 EJERCICIO 1*/

import java.util.Scanner;

public class MenuDeOpciones {

	public static void main(String[] args) {

		opcion(menu());
	}

	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int numero;
		numero = entrada.nextInt();
		return numero;
	}

	public static int menu() {
		int opcion;

		System.out.println("Elije una opcion \n" + "1. Cuadrado \n" + "2. Triangulo \n" + "3. Rectangulo \n"
				+ "4. Circulo \n" + "0. Salir del programa");
		opcion = pedirNumero();
		return opcion;
	}

	public static double calcularArea() {
		double resultado;
		System.out.print("Ingresa la base: ");
		double base = pedirNumero();

		System.out.print("Ingresa la altura: ");
		double altura = pedirNumero();

		resultado = base * altura;

		return resultado;
	}

	public static void opcion(int opcion) {
		System.out.println("Haz seleccionado opcion: " + opcion);
		switch (opcion) {
		case 1:
			cuadrado();
			break;
		case 2:
			triangulo();
			break;
		case 3:
			rectangulo();
			break;
		case 4:
			circulo();
			break;
		case 0:
			System.out.println("Fin del programa...");
			System.exit(0);
			break;

		default:
			if (opcion > 4) {
				System.err.println("¡Error! Haz seleccionado una opcion que no existe");
			}
			break;
		}
	}

	public static double calcularAreaUnDato() {
		double resultado;
		double numero;
		System.out.print("Ingresa un numero: ");
		numero = pedirNumero();
		resultado = numero * numero;
		return resultado;
	}

	public static void cuadrado() {
		System.out.print("El area del cuadrado es: " + calcularAreaUnDato());

	}

	public static void triangulo() {
		System.out.print("El area del trigulo es: " + (calcularArea()) / 2);
	}

	public static void rectangulo() {
		System.out.print("El area del rectangulo es: " + calcularArea());
	}

	public static void circulo() {
		System.out.print("El area del circulo es: " + calcularAreaUnDato() * Math.PI);
	}
}