package basic.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * M5 EJERCICIO 5
 * Tienes que modificar el programa de las becas (M4 Ejercicio 3)
 * Ahora el programa debe poder dar 5 becas.

 * El programa irá recabando los datos de los alumnos/as hasta que se den estas 5 becas.
 * Una vez que el programa haya asignado las 5 becas se debe mostrar por pantalla los nombres de los/as 5 alumnos que tienen beca.
*/

public class ValidarBeca2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		ArrayList<String> lstNombres = new ArrayList<String>();
		int edad;
		int becas = 0;
		String nombreAlumno;
		String tituloUni;
		String paro;

		while (becas <= 4) {
			System.out.print("Edad: ");
			edad = entrada.nextInt();

			System.out.print("¿Tienes titulo universitario?: ");
			tituloUni = entrada.next();

			System.out.print("¿Estas en paro?: ");
			paro = entrada.next();

			if ((edad >= 18 && tituloUni.equalsIgnoreCase("SI")) || (paro.equalsIgnoreCase("SI"))) {
				System.out.print("¿Como te llamas?: ");
				nombreAlumno = entrada.next();
				lstNombres.add(nombreAlumno);
				becas++;
			} else {
				System.out.println("No tienes la beca \n");
			}
		}

		System.out.println("\nLos siguientes nombres tienen la beca: ");
		for (int i = 0; i < lstNombres.size(); i++) {
			System.out.println((i + 1) + ". " + lstNombres.get(i));
		}
	}
}