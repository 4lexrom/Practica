package poo.m8.ejercicio4;

import java.util.List;

public class Cine extends Edificio {

	private final int AFORO_MAXIMO = 100;
	private int numeroAsistentes;
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

	public void verInfoEdificio(List<Edificio> edificios) {
		super.imprimirDatosEnComun();
	}

	public void proyectarSession(List<Edificio> edificios, int numeroAsistentes, double precioEntrada) {
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
			Edificio edificio = edificios.get(indice);
			if (edificio instanceof Cine) {
				Cine cine = (Cine) edificio;
				cine.setNumeroAsistentes(numeroAsistentes);
				cine.setPrecioEntrada(precioEntrada);
				double totalRecaudado = cine.getNumeroAsistentes() * cine.getPrecioEntrada();
				textoDescriptivo("El cine " + cine.getNombre() + " recaudó " + totalRecaudado + "€" + "\n");
			} else {
				System.err.println("¡El edificio " + consultaEdificio + " no es un cine!");
			}
		}
	}

	public int getNumeroAsistentes() {
		return numeroAsistentes;
	}

	public void setNumeroAsistentes(int numeroAsistentes) {
		this.numeroAsistentes = numeroAsistentes;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
}