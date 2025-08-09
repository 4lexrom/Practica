package basic.m7_1;

import java.util.ArrayList;
import java.util.Scanner;

/* M7.1 EJERCICIO 1 */

public class CalculaMediaNotas {

	public static void main(String[] args) {

		int cantNotas;
		System.out.print("Cantidad de notas: ");
		cantNotas = (int) pedirNumero();

		validarMedia(calcularMedia(pedirNota(cantNotas)));
	}

	public static double pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		double numero;
		numero = entrada.nextInt();
		return numero;
	}

	public static ArrayList<Double> pedirNota(int cantNotas) {
		ArrayList<Double> lstNotas = new ArrayList<Double>();
		double nota;
		for (int i = 0; i < cantNotas; i++) {
			System.out.print((i + 1) + ". Ingresar nota: ");
			nota = pedirNumero();
			if (nota >= 0 && nota <= 10) {
				lstNotas.add(nota);
			} else {
				System.out.println("¡Error! Ingresa notas entre 0 y 10");
				System.exit(0);
			}

		}
		return lstNotas;
	}

	public static void validarNota(ArrayList<Double> notas) {
		for (int i = 0; i < notas.size(); i++) {

		}
	}

	public static void validarMedia(double media) {
		if (media < 5) {
			System.out.println("Tienes que recuperar");
		} else if (media >= 5 && media <= 7) {
			System.out.println("Deberias segir practicando");
		} else {
			System.out.println("Pasa al siguiente nivel");
		}
	}

	public static double calcularMedia(ArrayList<Double> notas) {
		double media = 0;
		double suma = 0;
		for (int i = 0; i < notas.size(); i++) {
			suma += notas.get(i);
			media = suma / 3;
		}
		return media;
	}
}