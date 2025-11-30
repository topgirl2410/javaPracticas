package ejerciciosScanner;

import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Precio del producto: ");
		double precio = sc.nextDouble();

		double total = precio * 1.21;

		System.out.println("Precio final con IVA: " + total);
	}

}
