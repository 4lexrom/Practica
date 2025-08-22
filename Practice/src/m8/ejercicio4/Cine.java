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

	public Cine() {

	}

	public ArrayList<Cine> crearCine() {
		ArrayList<Cine> cines = new ArrayList<Cine>();
		int cantCines, numPlantas, superficie;
		String nombre;

		System.out.print("Numero de cines a crear: ");
		cantCines = pedirNumero();
		for (int i = 0; i < cantCines; i++) {
			System.out.println("..::Cine " + (i + 1) + "::..");
			System.out.print("Nombre del cine: ");
			nombre = pedirTexto();
			System.out.print("Numero de plantas: ");
			numPlantas = pedirNumero();
			System.out.print("Superficie: ");
			superficie = pedirNumero();
			cines.add(new Cine(nombre, numPlantas, superficie));
		}
		return cines;
	}

	public void eliminarCine(ArrayList<Cine> cines) {

		System.out.print("Nombre del cine que deseas eliminar: ");
		String edificioConsulta = pedirTexto();

		int indiceCine = buscarEdificio(cines, edificioConsulta);

		if (indiceCine == -1) {
			System.err.println(("¡El cine ingresado no existe!"));
		} else {
			System.out.println("Se eliminó el Cine " + edificioConsulta);
			cines.remove(indiceCine);
		}
	}

	public void proyectarSession(int indiceCine, ArrayList<Cine> cines, int numAsistentes, double precioEntrada) {
		double totalRecaudo;

		if (numAsistentes > 100) {
			System.out.println("Supera el aforo máximo permitido");
		} else {
			totalRecaudo = precioEntrada * numAsistentes;
			System.out.println("El cine " + cines.get(indiceCine).getNombre() + " recaudó " + totalRecaudo + "€");
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