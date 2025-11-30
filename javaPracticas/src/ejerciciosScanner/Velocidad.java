package ejerciciosScanner;

import java.util.Scanner;

public class Velocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Velocidad en km/h: ");
		double kmh = sc.nextDouble();

		double ms = kmh / 3.6;

		System.out.println("Equivalente en m/s: " + ms);
	}

}
