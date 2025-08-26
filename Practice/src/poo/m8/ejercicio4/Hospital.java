package poo.m8.ejercicio4;

import java.util.List;

public class Hospital extends Edificio {

	private int cantEnfermos;
	private final byte CANT_RACIONES = 3;

	public Hospital(String nombre, int numPlantas, int superficie, int cantEnfermos) {
		super(nombre, numPlantas, superficie);
		this.cantEnfermos = cantEnfermos;
	}

	public Hospital() {

	}

	@Override
	public Hospital crearEdificio() {
		int cantEnfermos;

		datosEnComun();

		textoDescriptivo("Numero de enfermos: ");
		cantEnfermos = pedirNumero();

		Hospital hospital = new Hospital(getNombre(), getNumPlantas(), getSuperficie(), cantEnfermos);

		return hospital;
	}

	public void verInformacion(List<Edificio> edificios) {
		for (Edificio edificio : edificios) {
			Hospital h = (Hospital) edificio;
			textoDescriptivo(
					"El hospital " + h.getNombre() + " tiene " + h.getNumPlantas() + " plantas, una superficie de "
							+ h.getSuperficie() + "m2 y tiene " + h.getCantEnfermos() + " enfermos" + "\n");
		}
	}

	public void repartirAlmuerzo(List<Edificio> edificios) {
		int cantRaciones = 0;

		textoDescriptivo("\tConsultar cantidad de almuerzos repartidos " + "\n");
		textoDescriptivo("Nombre del edificio: ");
		String consultaEdificio = pedirTexto();

		int indice = buscar(edificios, consultaEdificio);

		Edificio edificio = edificios.get(indice);

		if (indice == -1) {
			System.err.println("¡El edificio " + consultaEdificio + " No existe!");
			return;
		}

		Hospital hopsital = (Hospital) edificio;
		cantRaciones = hopsital.getCantEnfermos() * CANT_RACIONES;

		System.out.println("Se estan repartiendo " + cantRaciones + " raciones");
	}

	public int getCantEnfermos() {
		return cantEnfermos;
	}

	public void setCantEnfermos(int cantEnfermos) {
		this.cantEnfermos = cantEnfermos;
	}

	public byte getCANT_RACIONES() {
		return CANT_RACIONES;
	}
}