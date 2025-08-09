package basic.m7_3;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 7.3 EJERCICIO 6*/

public class EliminarNumerosDuplicados {

	public static void main(String[] args) {

		System.out.print("Cuantos numeros vas agregar?? ");
		int cantNumero = pedirNumero();

		verListaActualizadaNumero(eliminarNumeroDuplicado(crearListaNumero(cantNumero)));
	}

	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int numero;
		numero = entrada.nextInt();
		return numero;
	}

	public static ArrayList<Integer> crearListaNumero(int cantNumeros) {
		ArrayList<Integer> lstNumeros = new ArrayList<Integer>();
		int numero;
		for (int i = 0; i < cantNumeros; i++) {
			System.out.print((i) + ". Ingresa un numero: ");
			numero = pedirNumero();
			lstNumeros.add(numero);
		}
		return lstNumeros;
	}

	public static ArrayList<Integer> eliminarNumeroDuplicado(ArrayList<Integer> lstNumeros) {
		int contador = 0;
		int numero;
		int comparar;
		
		for (int i = 0; i < lstNumeros.size(); i++) {
			numero = lstNumeros.get(i);
			for (int j = 0; j < lstNumeros.size(); j++) {
				comparar = lstNumeros.get(j);
				if (numero == comparar && i != j) {
					lstNumeros.remove(j);
					contador++;
				}
			}
		}
		System.out.print("Se eliminaron " + contador + " numeros porque esaban duplicados" + "\n");
		return lstNumeros;
	}

	public static void verListaActualizadaNumero(ArrayList<Integer> lstNumeros) {
		System.out.println("Lista actualizada");
		for (int i = 0; i < lstNumeros.size(); i++) {
			System.out.print(lstNumeros.get(i) + " ");
		}
	}
}