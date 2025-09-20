package poo.m8.ejercicio6;

public class Mecanico extends Persona {

	private boolean estudios;

	public Mecanico(String dni, String nombre, String primerApellido, int edad, double salario, int año, int mes,
			int dia, boolean estudios) {
		super(dni, nombre, primerApellido, edad, salario, año, mes, dia);
		this.estudios = estudios;
	}

	public boolean isEstudios() {
		return estudios;
	}

	public void setEstudios(boolean estudios) {
		this.estudios = estudios;
	}
}