package poo.m8.ejercicio4;

import java.util.List;
import java.util.Scanner;

public abstract class Edificio {

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

	public abstract List<Edificio> crearEdificio();

	public abstract void mostrarEdificio(List<Edificio> edificios);

	public void limpiarEdificio(List<Edificio> edificios) {
		int tiempoPorM2, tiempoPorPlanta, TotalTiempo, horas, minutos;
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
			TotalTiempo = tiempoPorPlanta + tiempoPorM2;
			horas = TotalTiempo / 60;
			minutos = horas % 60;
			costePorMinuto = TotalTiempo * 1;
			costeMes = costePorMinuto * 30;
			textoDescriptivo("El tiempo para servicio de limpieza del edificio " + consultaEdificio + " es de " + horas
					+ "Hrs con " + minutos + "Min," + " y tiene un coste mensual de " + costeMes + "€\n");
		} else {
			System.err.println("¡El edificio " + consultaEdificio + " No existe!");
		}
	}

	public void calcularCosteVigilancia(List<Edificio> edificios) {
		double costeTotalMes;
		int cantVigilantes;
		final int PLUS_PELIGROSIDAD = 500;
		final int SALARIO_BASE = 1300;

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
			cantVigilantes = (int) Math.ceil(superficie / 1000);
			costeTotalMes = cantVigilantes * SALARIO_BASE;
			if (edificio instanceof Hotel) {
				costeTotalMes += PLUS_PELIGROSIDAD;
			}
		} else {
			cantVigilantes = superficie / 3000;
			costeTotalMes = cantVigilantes * SALARIO_BASE;
		}

		System.out.println(
				"Se necesitan " + cantVigilantes + " personas para prestar el servico de vigilancia en el edificio "
						+ consultaEdificio + ", el costo por mes es de " + costeTotalMes + "€");
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
		} else {
			textoDescriptivo("Se eliminó el edificio " + consultaEdificio);
			edificios.remove(indice);
		}
	}

	public void mostrarDatosComunes(List<Edificio> edificios) {
		textoDescriptivo("\tInformacion del edificio" + "\n");
		for (Edificio edificio : edificios) {
			textoDescriptivo("El hospital " + edificio.getNombre() + " tiene " + edificio.getNumPlantas() + " plantas y "
					+ " una superficie de " + edificio.getSuperficie() + "m2" + "\n");
		}
	}

	public int buscar(List<Edificio> edificios, String consultaEdificio) {
		boolean encontrado = false;
		int indice = -1;
		int i = 0;
		String edificioActual;

		while (!encontrado && i < edificios.size()) {
			edificioActual = edificios.get(i).getNombre();
			if (edificioActual.equalsIgnoreCase(consultaEdificio)) {
				encontrado = true;
				indice = i;
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