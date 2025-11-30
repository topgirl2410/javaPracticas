package ejerciciosScanner;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero: ");
		int n = sc.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

}
