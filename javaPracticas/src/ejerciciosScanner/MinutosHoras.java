package ejerciciosScanner;

import java.util.Scanner;

public class MinutosHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingresa minutos: ");
		int min = sc.nextInt();

		int horas = min / 60;
		int resto = min % 60;

		System.out.println(min + " minutos " + horas + " horas y " + resto + " minutos");
	}

}
