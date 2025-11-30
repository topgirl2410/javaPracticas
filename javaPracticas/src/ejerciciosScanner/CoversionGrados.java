package ejerciciosScanner;

import java.util.Scanner;

public class CoversionGrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Grados Celsius: ");
		double c = sc.nextDouble();

		double f = c * 9 / 5 + 32;

		System.out.println("Equivalente en Fahrenheit: " + f);
	}

}
