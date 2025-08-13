package m8.ejercicio4;

public class Hotel extends Edificio {

	private int numHabitaciones;

	public Hotel(String nombre, int numPlantas, int superficie, int numHabitaciones) {
		super(nombre, numPlantas, superficie);
		this.numHabitaciones = numHabitaciones;

	}

	public void calcularServHabitacion() {
		int personasNecesarias;
		double total;
		double sueldo = 1000;
		personasNecesarias = numHabitaciones / 20;
		total = personasNecesarias * sueldo;
		System.out.println("Se necesita " + personasNecesarias
				+ " personas para atender el servicio y tiene un costo de : " + total);
	}

}
