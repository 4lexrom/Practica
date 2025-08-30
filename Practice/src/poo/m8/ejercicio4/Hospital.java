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

	public void verInfoEdificio(List<Edificio> edificios) {
		for (Edificio edificio : edificios) {
			if (edificio instanceof Hospital) {
				Hospital h = (Hospital) edificio;
				h.imprimirDatosEnComun();
				textoDescriptivo("Tiene " + h.getCantEnfermos() + " enfermos" + "\n");
			}
		}
	}

	public int calcularCantidadVigilantes() {
		int cantVigilantes = super.getSuperficie() / 1000;
		return cantVigilantes;
	}

	public double calcularCosteVigilantes() {
		double costeVigilanacia = calcularCantidadVigilantes() * 1300;
		return costeVigilanacia;
	}

	public void repartirAlmuerzo(List<Edificio> edificios) {
		int cantRaciones = 0;

		textoDescriptivo("\tConsultar cantidad de almuerzos repartidos " + "\n");
		textoDescriptivo("Nombre del edificio: ");
		String consultaEdificio = pedirTexto();

		int indice = buscar(edificios, consultaEdificio);

		if (indice == -1) {
			System.err.println("¡El edificio " + consultaEdificio + " No existe!");
			return;
		}

		Edificio edificio = edificios.get(indice);
		Hospital hospital = (Hospital) edificio;

		cantRaciones = hospital.getCantEnfermos() * CANT_RACIONES;

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