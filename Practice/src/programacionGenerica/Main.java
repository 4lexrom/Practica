package programacionGenerica;

public class Main {

	public static void main(String[] args) {

		Empleado programador = new Empleado("Alexander", 38, 2200);
		Jefe senior = new Jefe("Jordi", 40, 4200);
		senior.setIncentivo(800);
		
		Pareja<Empleado> programadorJunior = new Pareja<Empleado>();
		programadorJunior.setPrimero(programador);
		Pareja.imprimirTrabajador(programadorJunior);

		Pareja<Jefe> jefeDeProyectos = new Pareja<Jefe>();
		jefeDeProyectos.setPrimero(senior);
		Pareja.imprimirTrabajador(jefeDeProyectos);
	}
}