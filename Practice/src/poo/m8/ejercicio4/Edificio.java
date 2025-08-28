package poo.m8.ejercicio4;

import java.util.List;
import java.util.Scanner;

public abstract class Edificio {

	private final int PLUS_PELIGROSIDAD = 500;
	private final int SALARIO_BASE = 1300;
	private final double SUPERFICIE_MINIMA = 1000;
	private final double SUPERFICIE_MAXIMA = 3000;
	private String nombre;
	private int numPlantas;
	private int superficie;

	private static final Scanner entrada = new Scanner(System.in);

	public Edificio(String nombre, int numPlantas, int superficie) {
		this.nombre = nombre;
		this.numPlantas = numPlantas;
		this.superficie = superficie;
	}

	public Edificio() {

	}

	public abstract Edificio crearEdificio();

	public abstract void verInfoEdificio(List<Edificio> edificios);

	public void imprimirDatosEnComun() {
		textoDescriptivo(
				"El edificio " + getNombre() + " de " + getSuperficie() + "m2 y " + getNumPlantas() + " plantas. ");
	}

	public void consultarEdificio(List<Edificio> edificios) {
		textoDescriptivo("\tEscribir nombre del edificio a consultar" + "\n");
		textoDescriptivo("Nombre del edificio: ");
		String consultaEdificio = pedirTexto();

		int indice = buscar(edificios, consultaEdificio);

		if (indice == -1) {
			System.err.println("¡El edificio " + consultaEdificio + " No existe!");
			return;
		}

		Edificio edificio = edificios.get(indice);

		textoDescriptivo("Nombre del edificio consultado: " + edificio.getNombre() + "\n");
	}

	public void limpiarEdificio(List<Edificio> edificios) {
		int tiempoPorM2, tiempoPorPlanta, TotalTiempoEnMinutos, horas, minutos;
		double costePorMinuto, costeMes;

		textoDescriptivo("\tConsultar datos de limpieza de un edificio " + "\n");
		textoDescriptivo("Nombre del edificio: ");
		String consultaEdificio = pedirTexto();

		int indice = buscar(edificios, consultaEdificio);

		if (indice != -1) {
			int superficie = edificios.get(indice).getSuperficie();
			int numPlantas = edificios.get(indice).getNumPlantas();

			tiempoPorM2 = superficie / 5;
			tiempoPorPlanta = numPlantas * 30;
			TotalTiempoEnMinutos = tiempoPorPlanta + tiempoPorM2;
			horas = TotalTiempoEnMinutos / 60;
			minutos = TotalTiempoEnMinutos % 60;
			costePorMinuto = TotalTiempoEnMinutos * 1;
			costeMes = costePorMinuto * 30;
			textoDescriptivo("El tiempo para servicio de limpieza del edificio " + consultaEdificio + " es de " + horas
					+ "Hrs y " + minutos + "Min," + " y tiene un coste mensual de " + costeMes + "€\n");
		} else {
			System.err.println("¡El edificio " + consultaEdificio + " No existe!");
		}
	}

	public void calcularCosteVigilancia(List<Edificio> edificios) {
		double costeTotalVigilanciaMes;
		double costePlusPeligrosidad;
		int cantVigilantes;
		double calcularSuperficie;

		textoDescriptivo("\tConsultar datos de vigilancia de un edificio " + "\n");
		textoDescriptivo("Nombre del edificio: ");
		String consultaEdificio = pedirTexto();

		int indice = buscar(edificios, consultaEdificio);

		if (indice == -1) {
			System.err.println("¡El edificio " + consultaEdificio + " No existe!");
			return;
		}

		Edificio edificio = edificios.get(indice);
		int superficie = edificio.getSuperficie();

		if (edificio instanceof Hospital || edificio instanceof Hotel) {
			calcularSuperficie = superficie / SUPERFICIE_MINIMA;
			cantVigilantes = (int) Math.ceil(calcularSuperficie);
			costeTotalVigilanciaMes = cantVigilantes * SALARIO_BASE;
			if (edificio instanceof Hotel) {
				costePlusPeligrosidad = cantVigilantes * PLUS_PELIGROSIDAD;
				costeTotalVigilanciaMes += costePlusPeligrosidad;
			}
		} else {
			calcularSuperficie = superficie / SUPERFICIE_MAXIMA;
			cantVigilantes = (int) Math.ceil(calcularSuperficie);
			costeTotalVigilanciaMes = cantVigilantes * SALARIO_BASE;
		}

		System.out.println(
				"Se necesitan " + cantVigilantes + " personas para prestar el servico de vigilancia en el edificio "
						+ consultaEdificio + ", el costo por mes es de " + costeTotalVigilanciaMes + "€");
	}

	protected void datosEnComun() {
		textoDescriptivo("Nombre del edificio: ");
		this.nombre = pedirTexto();

		textoDescriptivo("Numero de plantas: ");
		this.numPlantas = pedirNumero();

		textoDescriptivo("Superficie: ");
		this.superficie = pedirNumero();
	}

	public void eliminarEdificio(List<Edificio> edificios) {
		textoDescriptivo("\tEliminar edificio " + "\n");
		textoDescriptivo("Nombre del edificio: ");
		String consultaEdificio = pedirTexto();

		int indice = buscar(edificios, consultaEdificio);

		if (indice == -1) {
			System.err.println("¡El edificio " + consultaEdificio + " No existe!" + "\n");
			return;
		}
		textoDescriptivo("Se eliminó el edificio " + consultaEdificio + "\n");
		edificios.remove(indice);
	}

	public int buscar(List<Edificio> edificios, String consultaEdificio) {
		boolean encontrado = false;
		int indice = -1;
		int i = 0;
		String edificioActual;

		while (!encontrado && i < edificios.size()) {
			edificioActual = edificios.get(i).getNombre();
			if (edificioActual.equalsIgnoreCase(consultaEdificio)) {
				indice = i;
				encontrado = true;
			}
			i++;
		}
		return indice;
	}

	public int pedirNumero() {
		int numero = entrada.nextInt();
		return numero;
	}

	public String pedirTexto() {
		String texto = entrada.next();
		return texto;
	}

	public void textoDescriptivo(String texto) {
		System.out.print(texto);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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