package basic;

import java.util.Scanner;

/*
 * M4 EJERCICIO 4
 * El usuario introduce un mes por pantalla y mediante un switch con los 12 meses del año, el programa calcula los días del mes
 *  y muestra lo siguiente:
 *Ejemplo: Si el número introducido es 1, entonces debe aparecer por pantalla: “El mes de enero tiene 31 días”
 */

public class MesesDelAñoSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int mes;
		int num;

		System.out.print("Ingresa un mes del año: ");
		mes = entrada.nextInt();

		if (mes >= 1 && mes <= 12) {

			switch (mes) {
			case 1: {
				System.out.print("Enero tiene 31 dias");
				break;
			}
			case 2: {
				System.out.print("Febrero tiene 31 dias");
				break;
			}
			case 3: {
				System.out.print("Marzo tiene 31 dias");
				break;
			}
			case 4: {
				System.out.print("Abril tiene 31 dias");
				break;
			}
			case 5: {
				System.out.print("Mayo tiene 31 dias");
				break;
			}
			case 6: {
				System.out.print("Junio tiene 31 dias");
				break;
			}
			case 7: {
				System.out.print("Julio tiene 31 dias");
				break;
			}
			case 8: {
				System.out.print("Agosto tiene 31 dias");
				break;
			}
			case 9: {
				System.out.print("Septiembre tiene 31 dias");
				break;
			}
			case 10: {
				System.out.print("Octubre tiene 31 dias");
				break;
			}
			case 11: {
				System.out.print("Noviembre tiene 31 dias");
				break;
			}
			case 12: {
				System.out.print("Diciembre tiene 31 dias");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + mes);
			}
		} else {
			System.out.println("El numero ingresado no esta dentro del rango 1 y 12");
		}
	}
}