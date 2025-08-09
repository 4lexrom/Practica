package m8.ejercicio3;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private ArrayList<Cuenta> cuentas;

	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas, ArrayList<Integer> indicesCuentas) {
		System.out.println("\n" + "\tCuentas asignadas al cliente " + this.nombre + " " + this.apellido);
		for (int i = 0; i < indicesCuentas.size(); i++) {
			System.out.println("Cuenta No. " + cuentas.get(indicesCuentas.get(i)).getnumCuenta());
		}
	}
}