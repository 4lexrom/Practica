package poo.m8.ejercicio4;

import java.util.ArrayList;
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
	public List<Edificio> crearEdificio() {
		List<Edificio> hospitales = new ArrayList<Edificio>();

		textoDescriptivo("¿Cuantos hospitales vas a crear? ");
		int cantHospitales = pedirNumero();

		for (int i = 0; i < cantHospitales; i++) {
			datosEnComun();

			textoDescriptivo("Numero de enfermos: ");
			int cantEnfermos = pedirNumero();

			hospitales.add(new Hospital(getNombre(), getNumPlantas(), getSuperficie(), cantEnfermos));
		}
		return hospitales;
	}

	public void mostrarEdificio(List<Edificio> edificios) {
		mostrarDatosComunes(edificios);
		textoDescriptivo("El hospital tiene " + this.cantEnfermos + "\n");
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