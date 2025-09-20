package poo.m8.ejercicio6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public abstract class Persona {

	private int id;
	private static int contadorId = 1;
	private String dni;
	private String nombre;
	private String primerApellido;
	private int edad;
	private double salario;
	private Date fechaIngreso;
	private int año, mes, dia;

	Scanner entrada = new Scanner(System.in);

	public Persona(String dni, String nombre, String primerApellido, int edad, double salario, int año, int mes,
			int dia) {
		this.dni = dni;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.edad = edad;
		this.salario = 50.000;
		this.fechaIngreso = new GregorianCalendar(año, mes - 1, dia).getTime();
		this.id = contadorId;
		contadorId++;
	}

	public Persona() {

	}

	public void verTodo() {
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("DNI: " + getDni() + "\n" + "Nombre: " + getNombre() + "\n" + "Primer apellido:"
				+ getPrimerApellido() + "\n" + "Edad: " + getEdad() + "\n" + "Salario: " + getSalario()
				+ "Fecha ingreso: " + formatoFecha.format(getFechaIngreso()) + "\n");
	}

	public int getId() {
		return id;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
}