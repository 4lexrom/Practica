package m8.ejercicio2;

public class Hotel {
	String nombre;
	int numHabitaciones;
	int numPlantas;
	int superficie;

	public Hotel() {

	}

	public Hotel(String nombre, int numHabitaciones, int numPlantas, int superficie) {
		super();
		this.nombre = nombre;
		this.numHabitaciones = numHabitaciones;
		this.numPlantas = numPlantas;
		this.superficie = superficie;
	}

	public void calcularMantto() {
		double salario = 1500;
		double costeTotalServicio;
		int personNecesarias;

		personNecesarias = numHabitaciones / 20;
		Math.abs(personNecesarias);
		Math.ceil(personNecesarias);
		costeTotalServicio = salario * personNecesarias;

		System.out.println("Son necesarias " + personNecesarias + " personas para atenter el servicio.");
		System.out.println("El coste total del servicio es de: " + costeTotalServicio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public int getNumPlantas() {
		return numPlantas;
	}

	public void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
}