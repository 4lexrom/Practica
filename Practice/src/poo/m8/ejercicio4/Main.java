package poo.m8.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Edificio> hospitales = new ArrayList<Edificio>();
		Hospital hospital = new Hospital();
		
		hospitales = hospital.crearEdificio();
		hospital.calcularCosteVigilancia(hospitales);
		hospital.limpiarEdificio(hospitales);
		hospital.mostrarEdificio(hospitales);
		hospital.eliminarEdificio(hospitales);

	}

}
