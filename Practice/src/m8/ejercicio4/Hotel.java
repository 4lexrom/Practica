package m8.ejercicio4;

import java.util.ArrayList;

public class Hotel extends Edificio {

	private int numHabitaciones;

	public Hotel(String nombre, int numPlantas, int superficie, int numHabitaciones) {
		super(nombre, numPlantas, superficie);
		this.numHabitaciones = numHabitaciones;
	}

	public Hotel() {

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

	public void eliminarHotel(ArrayList<Hotel> hoteles) {

		System.out.print("Nombre del hotel que deseas eliminar: ");
		String edificioConsulta = pedirTexto();

		int indiceHotel = buscarEdificio(hoteles, edificioConsulta);

		if (indiceHotel == -1) {
			System.err.println(("¡El hotel ingresado no existe!"));
		} else {
			hoteles.remove(indiceHotel);
			System.out.println("Se eliminó el hotel " + edificioConsulta + "\n");
		}
	}

	public void calcularServHabitacion(ArrayList<Hotel> hoteles) {
		int personasNecesarias;
		double total = 0;
		double sueldo = 1000;

		System.out.print("Nombre del hotel que deseas conocer el servicio de habitaciones: ");
		String edificioConsulta = pedirTexto();

		int indiceHotel = buscarEdificio(hoteles, edificioConsulta);

		personasNecesarias = hoteles.get(indiceHotel).numHabitaciones / 20;
		if (indiceHotel == -1) {
			System.err.println(("¡El hospital ingresado no existe!"));
		} else if (personasNecesarias < 1) {
			personasNecesarias = 1;
			total = personasNecesarias * sueldo;
		} else {
			total = personasNecesarias * sueldo;
		}

		System.out.println("Se necesita " + personasNecesarias
				+ " personas para atender el servicio y tiene un costo de : " + total);

	}
}