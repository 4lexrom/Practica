package poo.m8.ejercicio4;

import java.util.List;

public class Cine extends Edificio {

	private final byte AFORO_MAXIMO = 100;
	private byte numeroAsistentes;
	private double precioEntrada;

	public Cine() {
	}

	public Cine(String nombre, int numPlantas, int superficie) {
		super(nombre, numPlantas, superficie);
	}

	public Cine crearEdificio() {
		datosEnComun();
		Cine cine = new Cine(getNombre(), getNumPlantas(), getSuperficie());
		return cine;
	}

	public void verInformacion(List<Edificio> edificios) {
		for (Edificio edificio : edificios) {
			Cine cine = (Cine) edificio;
			textoDescriptivo("El cine " + cine.getNombre() + " tiene " + cine.getNumPlantas()
					+ " plantas, una superficie de " + cine.getSuperficie() + "m2" + "\n");

		}
	}

	public void proyectarSession(List<Edificio> edificios, byte numeroAsistentes, double precioEntrada) {
		textoDescriptivo("\tConsultar informacion del cine " + "\n");
		textoDescriptivo("Nombre del edificio: ");
		String consultaEdificio = pedirTexto(); 

		int indice = buscar(edificios, consultaEdificio); 

		if (indice == -1) {
			System.err.println("¡El cine " + consultaEdificio + " No existe!");
			return;
		}

		if (numeroAsistentes > AFORO_MAXIMO) {
			textoDescriptivo("¡El numero de asistentes supera el aforo máximo permitido!" + "\n");
		} else {
			Cine cine = (Cine) edificios.get(indice);
			cine.setNumeroAsistentes(numeroAsistentes);
			cine.setPrecioEntrada(precioEntrada);
			double totalRecaudado = cine.getNumeroAsistentes() * cine.getPrecioEntrada();
			textoDescriptivo("El cine " + cine.getNombre() + " recaudó " + totalRecaudado + "€" + "\n");
		}
	}

	public byte getNumeroAsistentes() {
		return numeroAsistentes;
	}

	public void setNumeroAsistentes(byte numeroAsistentes) {
		this.numeroAsistentes = numeroAsistentes;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
}