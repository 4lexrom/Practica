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

	public String ingresarTexto() {
		Scanner entrada = new Scanner(System.in);
		String texto;
		texto = entrada.nextLine();
		return texto;
	}

	public void limpiar() {
		int tiempoPorM2;
		int tiempoPorPlanta;
		int totalTiempoLimpieza;
		int costePorMinuto;
		int costePorMes;

		tiempoPorM2 = (int) Math.ceil(this.superficie / 5); // Devuelve Minutos
		tiempoPorPlanta = (this.numPlantas * 30) / 60; // Devuelve Minutos
		totalTiempoLimpieza = (tiempoPorM2 + tiempoPorPlanta); // Devuelve Minutos
		costePorMinuto = (totalTiempoLimpieza / 60) * 1; // coste por minuto de trabajo
		costePorMes = costePorMinuto * 30;

		System.out.println("Tiempo de duracion de limpieza " + (totalTiempoLimpieza / 60) + "Hrs.");
	}

	public ArrayList<Edificio> crearEdificio() {
		ArrayList<Edificio> edificios = new ArrayList<Edificio>();
		int cantEdificios;
		System.out.print("Numero de edificios a crear: ");
		cantEdificios = pedirNumero();
		for (int i = 0; i < cantEdificios; i++) {
			System.out.println("\t..::Edificio " + (i + 1) + "::..");
			System.out.print("Nombre del edificio: ");
			nombre = ingresarTexto();
			System.out.print("Cantidad de plantas: ");
			numPlantas = pedirNumero();
			System.out.print("Superficie del edificio: ");
			superficie = pedirNumero();
			edificios.add(new Edificio(nombre, numPlantas, superficie));
		}
		return edificios;
	}

	public void mostrarEdificio(ArrayList<Edificio> edificios) {
		System.out.println("\t-----Listado de edificios-----");
		for (Edificio edificio : edificios) {
			System.out.println("\tEdificio " + edificio.nombre);
			System.out.println("Edificio: " + edificio.nombre + "\n" + "Plantas: " + edificio.numPlantas + "\n"
					+ "Superficie: " + edificio.superficie + "m2");
		}
	}

	public void eliminarEdificio(ArrayList<Edificio> edificios) {

		System.out.print("Nombre del edificio que deseas borrar: ");
		String nomEdificio = ingresarTexto();

		int indiceEdificio = buscarEdificio(edificios, nomEdificio);

		if (indiceEdificio == -1) {
			System.err.println(("¡El edificio " + nomEdificio + " no existe!"));
		} else {
			edificios.remove(indiceEdificio);
			System.out.println("Se eliminó el edificio " + nomEdificio);
		}
	}

	public int buscarEdificio(ArrayList<Edificio> edificios, String nomEdificio) {
		boolean encontrado = false;
		int indice = -1;
		int i = 0;
		while (!encontrado && i < edificios.size()) {
			if (edificios.get(i).nombre.equalsIgnoreCase(nomEdificio)) {
				indice = i;
				encontrado = true;
			}
			i++;
		}
		return indice;
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
}