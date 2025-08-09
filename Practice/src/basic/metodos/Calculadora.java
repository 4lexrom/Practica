package basic.metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		ArrayList<Double> numeros = new ArrayList<Double>();
		Double numero;

		for (int i = 0; i < 2; i++) {
			System.out.print("Ingresa un numero: ");
			numero = entrada.nextDouble();
			numeros.add(numero);
		}

		suma(numeros.get(0), numeros.get(1));
		multiplicacio(numeros.get(0), numeros.get(1));
		division(numeros.get(0), numeros.get(1));
		resta(numeros.get(0), numeros.get(1));

	}

	public static void suma(double num1, double num2) {
		double resultado;
		resultado = num1 + num2;
		System.out.println("Suma: " + resultado);
	}

	public static void multiplicacio(double num1, double num2) {
		double resultado;
		resultado = num1 * num2;
		System.out.println("Multiplicacion: " + resultado);
	}

	public static void division(double num1, double num2) {
		double resultado;
		resultado = num1 / num2;
		System.out.println("Division: " + resultado);
	}

	public static void resta(double num1, double num2) {
		double resultado;
		resultado = num1 - num2;
		System.out.println("Resta: " + resultado);
	}
}