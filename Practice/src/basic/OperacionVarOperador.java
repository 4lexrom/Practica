package basic;

import java.util.Scanner;

/*
 * M4 EJERCICIO 5
 * Hacer un programa que solicite dos números y un operador(+,-,*,/).
 * Al final, el programa debe imprimir por pantalla el resultado de realizar la operación que contenga la variable operador.
*/
public class OperacionVarOperador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1;
		int num2;
		int resultado;
		char operador;

		System.out.print("Ingresa un numero 1: ");
		num1 = entrada.nextInt();

		System.out.print("Ingresa un numero 2: ");
		num2 = entrada.nextInt();

		System.out.print("Ingresa un operador: ");
		operador = entrada.next().charAt(0);

		if (operador == '+') {
			resultado = num1 + num2;
			System.out.print("La Suma es " + resultado);
		} else if (operador == '-') {
			resultado = num1 - num2;
			System.out.print("La Resta es " + resultado);
		} else if (operador == '*') {
			resultado = num1 * num2;
			System.out.print("La Multiplicacion es " + resultado);
		} else if (operador == '/') {
			resultado = num1 / num2;
			System.out.print("La Division es " + resultado);
		}
	}
}