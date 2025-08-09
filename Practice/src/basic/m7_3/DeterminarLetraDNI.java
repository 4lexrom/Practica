package basic.m7_3;

import java.util.Scanner;

/* 7.3 EJERCICIO 4 */

public class DeterminarLetraDNI {

	public static void main(String[] args) {
		int residuo;
		String dni;

		System.out.print("Ingresar DNI: ");
		dni = pedirDNI();

		residuo = calcularNumeroDNI(dni);
		validarLetraDNI(dni, residuo);
	}

	public static String pedirDNI() {
		Scanner entrada = new Scanner(System.in);
		String numero;
		numero = entrada.nextLine();
		return numero;
	}

	public static int calcularNumeroDNI(String dni) {
		String numeroDNI;
		int suma = 0;
		int residuo;

		for (int i = 0; i <= dni.length() - 2; i++) {
			numeroDNI = String.valueOf(dni.charAt(i));
			suma += Integer.parseInt(numeroDNI);
		}
		residuo = suma % 23;

		return residuo;
	}

	public static void validarLetraDNI(String dni, int residuo) {
		String letraCorrecta;
		String letraDNI = String.valueOf((dni.charAt(dni.length() - 1)));
		String[] letras = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };

		letraCorrecta = letras[residuo];
		if (letraDNI.equalsIgnoreCase(letraCorrecta)) {
			System.out.println("La letra es correcta!");
		} else {
			System.err.println("Letra incorrecta, la letra correcta es: " + letraCorrecta);
		}
	}
}