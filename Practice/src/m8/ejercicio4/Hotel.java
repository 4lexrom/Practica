package m8.ejercicio4;

import java.util.ArrayList;

public class Hotel extends Edificio {

	private int numHabitaciones;

	public Hotel(String nombre, int numPlantas, int superficie, int numHabitaciones) {
		super(nombre, numPlantas, superficie);
		this.numHabitaciones = numHabitaciones;

	}

	public ArrayList<Hotel> crearHotel() {
		ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
		int cantHoteles, numPlantas, superficie, numHabitaciones;
		String nombreHotel;

		System.out.print("Cuantos hoteles vas a crear: ");
		cantHoteles = pedirNumero();

		for (int i = 0; i < cantHoteles; i++) {
			System.out.println("..::Hotel::.. " + (i + 1));
			System.out.print("Nombre: ");
			nombreHotel = pedirTexto();
			System.out.print("Numero de plantas: ");
			numPlantas = pedirNumero();
			System.out.print("Superficie: ");
			superficie = pedirNumero();
			System.out.print("Numero de habitaciones: ");
			numHabitaciones = pedirNumero();
			hoteles.add(new Hotel(nombreHotel, numPlantas, superficie, numHabitaciones));
		}
		return hoteles;
	}

	public int buscarHotel(ArrayList<Hotel> hoteles, String nomHotel) {
		boolean encontrado = false;
		int indice = 0;
		int i = 0;

		while (!encontrado && i < hoteles.size()) {
			if (hoteles.get(i).getNombre().equalsIgnoreCase(nomHotel)) {
				indice = i;
				encontrado = true;
			} else {
				indice = -1;
			}
			i++;
		}
		return indice;
	}

	public void eliminarHotel(ArrayList<Hotel> hoteles) {

		System.out.print("\n" + "Nombre del hotel que deseas borrar: ");
		String nomHotel = pedirTexto();

		int indiceHotel = buscarHotel(hoteles, nomHotel);

		if (indiceHotel == -1) {
			System.err.println("El hotel " + nomHotel + " no existe!");
		} else {
			hoteles.remove(indiceHotel);
			System.out.println("Se elimino el hotel " + nomHotel + "\n");
		}
	}

	public void mostrarHotel(ArrayList<Hotel> hotels) {
		System.out.println("---Listado de hoteles---");
		for (Hotel hotel : hotels) {
			System.out.println("Nombre hotel: " + hotel.getNombre());
		}
	}

	public void calcularServHabitacion(ArrayList<Hotel> hoteles) {
		int personasNecesarias;
		double total = 0;
		double sueldo = 1000;

		System.out.print("\n" + "Consultar servicio de habitaciones: ");
		String nomHotel = pedirTexto();

		int indiceHotel = buscarHotel(hoteles, nomHotel);

		personasNecesarias = hoteles.get(indiceHotel).numHabitaciones / 20;
		if (personasNecesarias < 1) {
			personasNecesarias = 1;
			total = personasNecesarias * sueldo;
		} else {
			total = personasNecesarias * sueldo;
		}

		System.out.println("Se necesita " + personasNecesarias
				+ " personas para atender el servicio y tiene un costo de : " + total);
	}

}
