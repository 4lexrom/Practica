package poo.m8.ejercicio6;

public class Piloto extends Persona {

	private double altura;
	private double peso;

	public Piloto(String dni, String nombre, String primerApellido, int edad, double salario, int año, int mes, int dia,
			double altura, double peso) {
		super(dni, nombre, primerApellido, edad, salario, año, mes, dia);
		this.altura = altura;
		this.peso = peso;
	}

	public Piloto() {
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}