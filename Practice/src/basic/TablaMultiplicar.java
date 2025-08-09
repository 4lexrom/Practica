package basic;

import java.util.Scanner;

/*
 * M3 EJERCICIO EXTRA 2
Escribe un programa Java que solicite por pantalla un número entero, y si es menor que 10, lo asigne a una variable de tipo int, llamada varInt.
Si no lo es, entonces le asignará a la variable varInt el número 1. (¿Utiliza para ello el operador condicional? :)
Luego, imprime la tabla de multiplicar de esta variable.
 */

public class TablaMultiplicar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int varInt;
		int numero;
		int Resultado;

		System.out.print("Ingresa un numero entre 1 y 10: ");
		numero = entrada.nextInt();

		if (numero < 10) {
			varInt = numero;
			for (int i = 1; i < 11; i++) {
				Resultado = varInt * i;
				System.out.println(varInt + "X" + i + " = " + Resultado);
			}
		} else {
			varInt = 1;
			System.out.println("El numero ingresado es mayor a 10");
		}
	}
}