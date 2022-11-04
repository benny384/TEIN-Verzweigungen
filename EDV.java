package Verzweigungen;

import java.util.Scanner;

public class EDV {

	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double umsatz;

		System.out.println("Bitte geben sie ihren Umsatz ein!");

		umsatz = tastatur.nextDouble();

		if (umsatz < 500) {
			System.out.println("Sie bekommen kein Rabatt!");
		}

		if (umsatz >= 500) {
			System.out.println("Ihr Rabatt beträgt 1% ! Ihr Umsatz betraegt somit : " + umsatz * 0.99);
		}

		else if (umsatz >= 1000) {
			System.out.println("Ihr Rabatt beträgt 2% ! Ihr Umsatz betraegt somit :  " + umsatz * 0.98);
		}

		else if (umsatz >= 2000) {
			System.out.println("Ihr Rabatt beträgt 5% ! Ihr Umsatz betraegt somit :  " + umsatz * 0.95);
		}

		else if (umsatz >= 10000) {
			System.out.println("Ihr Rabatt beträgt 10% ! Ihr Umsatz betraegt somit :  " + umsatz * 0.90);
		}

	}

}
