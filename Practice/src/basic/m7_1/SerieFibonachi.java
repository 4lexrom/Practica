package basic.m7_1;

import java.util.Scanner;

public class SerieFibonachi {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		int acumulador = 0;
		
		System.out.print("Ingresa un numero: ");
		numero = entrada.nextInt();
		
		for (int i = 1; i < numero; i++) {
			acumulador += i;
			acumulador -= 1;
			System.out.print(acumulador + ",");
		}

	}

}
