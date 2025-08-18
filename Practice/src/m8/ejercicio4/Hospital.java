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
		System.out.println("\t-----Listado de hospitales-----");
		for (Hospital hospital : hospitales) {
			System.out.println("-" + "Hospital: " + hospital.getNombre());
		}
	}

	public void eliminarHospital(ArrayList<Hospital> hospitales, int indiceHospital) {

		if (indiceHospital == -1) {
			System.err.println(("¡El hospital ingresado no existe!"));
		} else {
			System.out.println("Se eliminó el hospital " + hospitales.get(indiceHospital).getNombre()); 
			hospitales.remove(indiceHospital);			
		}
		mostrarHospital(hospitales);
	}

	public void repartirAlmuerzo(ArrayList<Hospital> hospitales, int indiceHospital) {
		int cantRaciones;
		int numEnfermos;

		if (indiceHospital == -1) {
			System.err.println("El hospital ingresado no existe!");
		} else {
			numEnfermos = hospitales.get(indiceHospital).getNumEnfermos();
			cantRaciones = numEnfermos * RACIONES;
			System.out.println("Se estan repartiendo " + cantRaciones + " raciones");
		}
	}

	public int getNumEnfermos() {
		return numEnfermos;
	}

	public void setNumEnfermos(int numEnfermos) {
		this.numEnfermos = numEnfermos;
	}
}