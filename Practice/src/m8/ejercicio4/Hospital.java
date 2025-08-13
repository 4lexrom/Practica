package m8.ejercicio4;

import java.util.ArrayList;

public class Hospital extends Edificio {

	private final int RACIONES;
	private int numEnfermos;

	// ¿Por que no me perite crear un constructor vacio?
	public Hospital(String nombre, int numPlantas, int superficie, int numEnfermos) {
		super(nombre, numPlantas, superficie);
		RACIONES = 3;
		this.numEnfermos = numEnfermos;
	}

	public ArrayList<Hospital> crearHospital() {
		ArrayList<Hospital> hospitales = new ArrayList<Hospital>();
		String nombre;
		int numPlantas, superficie, numEnfermos, cantHoteles;

		System.out.print("Numero de hospitales a crear: ");
		cantHoteles = pedirNumero();

		for (int i = 0; i < cantHoteles; i++) {
			System.out.println("\t..::Edificio " + (i + 1) + "::..");
			System.out.print("Nombre del hospital: ");
			nombre = pedirTexto();
			System.out.print("Cantidad de plantas: ");
			numPlantas = pedirNumero();
			System.out.print("Superficie del hospital: ");
			superficie = pedirNumero();
			System.out.print("Cantidad de enfermos: ");
			numEnfermos = pedirNumero();
			hospitales.add(new Hospital(nombre, numPlantas, superficie, numEnfermos));
		}
		return hospitales;
	}

	public void mostrarHospital(ArrayList<Hospital> hospitales) {
		System.out.println("\t-----Listado de edificios-----");
		for (Edificio hospital : hospitales) {
			System.out.println("-" + "Hospital: " + hospital.getNombre());
		}
	}

	public void eliminarHospital(ArrayList<Hospital> hospitales) {

		System.out.print("Nombre del edificio que deseas borrar: ");
		String nomEdificio = pedirTexto();

		int indiceEdificio = buscarHospital(hospitales, nomEdificio);

		if (indiceEdificio == -1) {
			System.err.println(("¡El edificio " + nomEdificio + " no existe!"));
		} else {
			hospitales.remove(indiceEdificio);
			System.out.println("Se eliminó el edificio " + nomEdificio);
		}
		mostrarHospital(hospitales);
	}

	public void repartirAlmuerzo(ArrayList<Hospital> hospitales) {
		int cantRaciones;
		int numEnfermos;

		System.out.print("Nombre del hospital a consultar: ");
		String nomHospital = pedirTexto();

		int indiceHospital = buscarHospital(hospitales, nomHospital);

		if (indiceHospital == -1) {
			System.err.println("El hospital no existe!");
		} else {
			numEnfermos = hospitales.get(indiceHospital).getNumEnfermos();
			cantRaciones = numEnfermos * RACIONES;
			System.out.println("Se estan repartiendo " + cantRaciones + " racionnes");
		}
	}

	public int buscarHospital(ArrayList<Hospital> hospitales, String nomEdificio) {
		boolean encontrado = false;
		int indice = -1;
		int i = 0;
		while (!encontrado && i < hospitales.size()) {
			if (hospitales.get(i).getNombre().equalsIgnoreCase(nomEdificio)) {
				indice = i;
				encontrado = true;
			}
			i++;
		}
		return indice;
	}

	public int getNumEnfermos() {
		return numEnfermos;
	}

	public void setNumEnfermos(int numEnfermos) {
		this.numEnfermos = numEnfermos;
	}
}