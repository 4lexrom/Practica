package poo.m8.ejercicio4;

import java.util.List;

public class Hotel extends Edificio {

	private final double CANT_HABTCION_POR_PERSONA = 20;
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
		totalSalario = numPersonas * 1000;
		System.out.println("\tInformacion del servicio de habitaciones");
		textoDescriptivo("Son necesarias " + (int) numPersonas + " personas y el total a pagar en sueldos es de "
				+ totalSalario + "€" + "\n");
	}

	public int calcularCantidadVigilantes() {
		int cantVigilantes = super.getSuperficie() / 1000;
		return cantVigilantes;
	}

	public double calcularCosteVigilantes() {
		double plusPeligrosidad = calcularCantidadVigilantes() * 500;
		double costeVigilanacia = ((calcularCantidadVigilantes() * 1300) + plusPeligrosidad);
		return costeVigilanacia;
	}

	public Hotel crearEdificio() {
		datosEnComun();
		textoDescriptivo("Cantidad de habitaciones: ");
		this.cantHabitaciones = pedirNumero();

		Hotel hotel = new Hotel(getNombre(), getNumPlantas(), getSuperficie(), this.cantHabitaciones);
		return hotel;
	}

	public void verInfoEdificio(List<Edificio> edificios) {
		for (Edificio edificio : edificios) {
			if (edificio instanceof Hotel) {
				Hotel h = (Hotel) edificio;
				h.imprimirDatosEnComun();
				textoDescriptivo("Tiene " + h.getCantHabitaciones() + " habitaciones" + "\n");
			}
		}
	}

	public int getCantHabitaciones() {
		return cantHabitaciones;
	}

	public void setCantHabitaciones(int cantHabitaciones) {
		this.cantHabitaciones = cantHabitaciones;
	}
}