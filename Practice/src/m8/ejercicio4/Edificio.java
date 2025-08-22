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

	public Edificio() {

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

	public void consultarCostVigilancia(ArrayList<? extends Edificio> edificios) {
		int cantVigilantes;

		System.out.print("Nombre del edificio que deseas conocer el coste de vigilancia: ");
		String edificioConsulta = pedirTexto();

		int indiceEdificio = buscarEdificio(edificios, edificioConsulta);

		if (indiceEdificio == -1) {
			System.err.println("¡El edificio ingresado no existe!");
			// Hospital
		} else if (edificios.get(indiceEdificio) instanceof Hospital) {
			cantVigilantes = edificios.get(indiceEdificio).getSuperficie() / 1000;
			System.out.println("Se necesitan " + cantVigilantes + " vigilantes y el coste mensual es de "
					+ (cantVigilantes * 1300) + "€");
			// Hotel
		} else if (edificios.get(indiceEdificio) instanceof Hotel) {
			cantVigilantes = edificios.get(indiceEdificio).getSuperficie() / 1000;
			System.out.println("Se necesitan " + cantVigilantes + " vigilantes y el coste mensual es de "
					+ (cantVigilantes * (1300 + 500)) + "€");
			// Cine
		} else {
			cantVigilantes = edificios.get(indiceEdificio).getSuperficie() / 3000;
			System.out.println("Se necesitan " + cantVigilantes + " vigilantes y el coste mensual es de "
					+ (cantVigilantes * 1300) + "€");
		}
	}

	public int buscarEdificio(ArrayList<? extends Edificio> edificios, String edificioConsulta) {
		boolean encontrado = false;
		String edificioActual;
		int indice = -1;
		int i = 0;

		while (!encontrado && i < edificios.size()) {
			edificioActual = edificios.get(i).getNombre();
			if (edificioActual.equalsIgnoreCase(edificioConsulta)) {
				indice = i;
				encontrado = true;
			}
			i++;
		}
		return indice;
	}

	public void limpiarEdificio(ArrayList<? extends Edificio> edificios) {
		int tiempoPorM2, tiempoPorPlanta, horas, minutos, costePorMinuto, costePorMes, totalTiempoLimpieza;

		System.out.print("Nombre del edificio que deseas conocer el coste de limpieza: ");
		String consultaEdificio = pedirTexto();

		int indiceEdificio = buscarEdificio(edificios, consultaEdificio);

		if (indiceEdificio == -1) {
			System.err.println("¡El edificio ingresado no existe!");
		} else {
			tiempoPorM2 = (int) Math.ceil(edificios.get(indiceEdificio).getSuperficie() / 5); // Devuelve Minutos
			tiempoPorPlanta = (edificios.get(indiceEdificio).getNumPlantas() * 30) / 60; // Devuelve Minutos
			totalTiempoLimpieza = (tiempoPorM2 + tiempoPorPlanta); // Devuelve minutos
			horas = totalTiempoLimpieza / 60; // Devuelve en horas
			minutos = horas % 60; // Devuelve en minutos
			costePorMinuto = totalTiempoLimpieza * 1; // coste por minuto de trabajo
			costePorMes = costePorMinuto * 30; // Coste mensual

			System.out.println("Se necesita " + horas + ":" + minutos + "Min. para hacer limpieza en el edifico "
					+ edificios.get(indiceEdificio).getNombre() + " y tiene coste mensual de " + costePorMes + "€");
		}
	}

	public void mostrarDatosEdificios(ArrayList<? extends Edificio> edificios) {
		for (Edificio edificio : edificios) {
			System.out.println("El edificio " + edificio.getNombre() + " tiene " + edificio.getNumPlantas()
					+ " plantas " + " y una superficie de " + edificio.getSuperficie() + "m2");
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