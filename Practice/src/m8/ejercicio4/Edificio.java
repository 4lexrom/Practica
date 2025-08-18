package m8.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Edificio {
	private String nombre;
	private int numPlantas;
	private int superficie;

	public Edificio(String nombre, int numPlantas, int superficie) {
		this.nombre = nombre;
		this.numPlantas = numPlantas;
		this.superficie = superficie;
	}

	public int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int numero;
		numero = entrada.nextInt();
		return numero;
	}

	public String pedirTexto() {
		Scanner entrada = new Scanner(System.in);
		String texto;
		texto = entrada.nextLine();
		return texto;
	}

	public int buscarEdificio(ArrayList<? extends Edificio> edificios) {
		boolean encontrado = false;
		String edificioConsultado, edificioActual;
		int indice = -1;
		int i = 0;

		System.out.print("Nombre del edificio a consultar: ");
		edificioConsultado = pedirTexto();

		while (!encontrado && i < edificios.size()) {
			edificioActual = edificios.get(i).getNombre();
			if (edificioActual.equalsIgnoreCase(edificioConsultado)) {
				indice = i;
				encontrado = true;
			}
			i++;
		}
		return indice;
	}

	public void limpiar(ArrayList<? extends Edificio> edificios, int indiceEdificio) {
		int tiempoPorM2;
		int tiempoPorPlanta;
		int totalTiempoLimpieza;
		int costePorMinuto;
		int costePorMes;

		if (indiceEdificio == -1) {
			System.err.println("El edificio ingresado no existe!");
		} else {
			tiempoPorM2 = (int) Math.ceil(edificios.get(indiceEdificio).getSuperficie() / 5); // Devuelve Minutos
			tiempoPorPlanta = (edificios.get(indiceEdificio).getNumPlantas() * 30) / 60; // Devuelve Minutos
			totalTiempoLimpieza = tiempoPorM2 + tiempoPorPlanta; // Devuelve Minutos
			costePorMinuto = totalTiempoLimpieza * 1; // coste por minuto de trabajo
			costePorMes = costePorMinuto * 30; // Coste mensual

			System.out.println("Se necesita " + totalTiempoLimpieza + "Min. para hacer limpieza en el edifico "
					+ edificios.get(indiceEdificio).getNombre() + " y tiene coste mensual de " + costePorMes + "€");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumPlantas() {
		return numPlantas;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
}