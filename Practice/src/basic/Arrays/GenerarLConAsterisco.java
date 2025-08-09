package basic.Arrays;

import java.util.Scanner;

public class GenerarLConAsterisco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int altura;
		int base;
		int j;

		System.out.print("Ingresa la altura: ");
		altura = entrada.nextInt();

		base = (altura / 2) + 1;

		for (int i = 1; i <= altura; i++) {
			System.out.println("*");
			j = i;
			if (j == altura-1) {
				for (; j >= base; j--) {
					System.out.print("*");
				}
			}
		}
	}
}