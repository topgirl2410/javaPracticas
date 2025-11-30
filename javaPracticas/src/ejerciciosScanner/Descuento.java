package ejerciciosScanner;

import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Precio original: ");
		double precio = sc.nextDouble();

		System.out.print("Porcentaje de descuento: ");
		double descuento = sc.nextDouble();

		double precioFinal = precio - (precio * descuento / 100);

		System.out.println("Precio final: " + precioFinal);
	}

}
