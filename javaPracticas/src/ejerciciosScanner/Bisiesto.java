package ejerciciosScanner;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingresa un año: ");
		int anio = sc.nextInt();

		boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

		if (esBisiesto) {
			System.out.println("El año " + anio + " es bisiesto");
		} else {
			System.out.println("El año " + anio + " no es bisiesto");
		}
	}

}
