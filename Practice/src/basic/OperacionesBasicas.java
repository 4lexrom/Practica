package basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * M3 EJERCICIO 2
Hacer un programa que le pida dos números enteros al usuario/a. Al final, el programa imprime por pantalla el siguiente mensaje:  

El resultado de la suma es: "valor"
El resultado del resto es: "valor"
El resultado de la multiplicación es: "valor"
El resultado de la división es: "valor".*/

public class OperacionesBasicas {

	public static void main(String[] args) {	

		Scanner entrada = new Scanner(System.in);
		int numero;
		char operador;
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 0; i < 2; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			numero = entrada.nextInt();
			numeros.add(numero);
			if (i == 1) {
				operador = entrada.next().charAt(0);
				if (operador == '+') {
					System.out.println("El resultado es: " + (numeros.get(i) + numeros.get(i - 1)));
				} else if (operador == '-') {
					System.out.println("El resultado es: " + (numeros.get(i) - numeros.get(i - 1)));
				} else if (operador == '*') {
					System.out.println("El resultado es: " + (numeros.get(i) * numeros.get(i - 1)));
				} else if (operador == '/') {
					System.out.println("El resultado es: " + (numeros.get(i) / numeros.get(i - 1)));
				}
			}
		}
	}
}