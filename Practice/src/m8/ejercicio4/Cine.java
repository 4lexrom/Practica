package m8.ejercicio4;

import java.util.ArrayList;

public class Cine extends Edificio {

	private double precioEntrada;
	private int numAsistentes;

	public Cine(String nombre, int numPlantas, int superficie, double precioEntrada, int numAsistentes) {
		super(nombre, numPlantas, superficie);
		this.precioEntrada = precioEntrada;
		this.numAsistentes = numAsistentes;
	}

	public Cine(String nombre, int numPlantas, int superficie) {
		super(nombre, numPlantas, superficie);
	}

	public ArrayList<Cine> crearEdificioCine() {
		ArrayList<Cine> cines = new ArrayList<Cine>();
		int cantCines, numPlantas, superficie, precioEntrada, numAsistentes;
		String nombreCine;

		System.out.print("Numero de cines a crear: ");
		cantCines = pedirNumero();
		for (int i = 0; i < cantCines; i++) {
			System.out.println("..::Cine " + (i + 1) + "::..");
			System.out.print("Nombre del cine: ");
			nombreCine = pedirTexto();
			System.out.print("Numero de plantas: ");
			numPlantas = pedirNumero();
			System.out.print("Superficie: ");
			superficie = pedirNumero();
			/*
			 * System.out.print("Precio entrada: "); precioEntrada = pedirNumero();
			 * System.out.print("Numero de asistentes: "); numAsistentes = pedirNumero();
			 */
			cines.add(new Cine(nombreCine, numPlantas, superficie/* , precioEntrada, numAsistentes */));
		}
		return cines;
	}

	public int buscarCine(ArrayList<Cine> cines, String nombreCine) {
		boolean encontrado = false;
		int i = 0;
		int indice = -1;

		while (!encontrado && i < cines.size()) {
			if (cines.get(i).getNombre().equalsIgnoreCase(nombreCine)) {
				indice = i;
				encontrado = true;
			}
			i++;
		}
		return indice;
	}

	public void eliminarCine(ArrayList<Cine> cines) {

		System.out.print("Nombre del cine que deseas borrar: ");
		String nombreCine = pedirTexto();

		int indiceCine = buscarCine(cines, nombreCine);

		if (indiceCine == -1) {
			System.err.println("El Cine " + nombreCine + " no existe!");
		} else {
			System.out.println("Se eliminó el Cine " + nombreCine);
			cines.remove(indiceCine);
		}
		mostrarCines(cines);

	}

	public void mostrarCines(ArrayList<Cine> cines) {
		System.out.println("---Listado de cines---");
		for (Cine cine : cines) {
			System.out.println("Cine: " + cine.getNombre());
		}
	}

	public void proyectarSession(int numAsistentes, double precioEntrada) {
		double totalRecaudo;

		if (numAsistentes > 100) {
			System.out.println("Se supera el aforo maximo permitido");
		} else {
			totalRecaudo =     precioEntrada * numAsistentes;
			System.out.println("Se han recaudado " + totalRecaudo + " euros");
		}
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public int getNumAsistentes() {
		return numAsistentes;
	}

	public void setNumAsistentes(int numAsistentes) {
		this.numAsistentes = numAsistentes;
	}
}