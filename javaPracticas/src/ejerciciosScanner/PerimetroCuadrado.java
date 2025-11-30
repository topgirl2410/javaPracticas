package ejerciciosScanner;

import java.util.Scanner;

public class PerimetroCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Lado del cuadrado: ");
		double lado = sc.nextDouble();

		double perimetro = lado * 4;

		System.out.println("Perimetro: " + perimetro);
	}

}
