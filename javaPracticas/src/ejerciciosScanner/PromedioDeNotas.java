package ejerciciosScanner;

import java.util.Scanner;

public class PromedioDeNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nota 1: ");
		double n1 = sc.nextDouble();

		System.out.print("Nota 2: ");
		double n2 = sc.nextDouble();

		System.out.print("Nota 3: ");
		double n3 = sc.nextDouble();

		double promedio = (n1 + n2 + n3) / 3;

		System.out.println("El promedio es: " + promedio);
	}

}
