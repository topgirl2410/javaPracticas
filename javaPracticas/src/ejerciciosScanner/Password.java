package ejerciciosScanner;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingresa una contraseña: ");
		String pass = sc.nextLine();

		if (pass.equals("1234")) {
			System.out.println("Acceso concedido");
		} else {
			System.out.println("Contraseña Incorrecta");
		}
	}

}
