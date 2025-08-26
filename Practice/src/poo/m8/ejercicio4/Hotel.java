package poo.m8.ejercicio4;

import java.util.List;

public class Hotel extends Edificio {

	private final double CANT_HABTCION_POR_PERSONA = 20;
	private final double SALARIO = 1000;
	private int cantHabitaciones;

	public Hotel() {
		super();
	}

	public Hotel(String nombre, int numPlantas, int superficie, int cantHabitaciones) {
		super(nombre, numPlantas, superficie);
		this.cantHabitaciones = cantHabitaciones;
	}

	public void calcularServHabitaciones() {
		double numPersonas;
		double totalSalario;
		double calcularPerNecesarias;

		calcularPerNecesarias = this.cantHabitaciones / CANT_HABTCION_POR_PERSONA;
		numPersonas = Math.ceil(calcularPerNecesarias);
		totalSalario = numPersonas * SALARIO;
		System.out.println("\tInformacion del servicio de habitaciones");
		textoDescriptivo("Son necesarias " + (int) numPersonas + " personas y el total a pagar en sueldos es de "
				+ totalSalario + "€" + "\n");
	}

	public Hotel crearEdificio() {
		datosEnComun();
		textoDescriptivo("Cantidad de habitaciones: ");
		this.cantHabitaciones = pedirNumero();

		Hotel hotel = new Hotel(getNombre(), getNumPlantas(), getSuperficie(), this.cantHabitaciones);
		return hotel;
	}

	public void verInformacion(List<Edificio> edificios) {

	}

	public int getCantHabitaciones() {
		return cantHabitaciones;
	}

	public void setCantHabitaciones(int cantHabitaciones) {
		this.cantHabitaciones = cantHabitaciones;
	}
}