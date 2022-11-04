package Verzweigungen;

import java.util.Scanner;

public class Dividieren {

	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double zahl1;
		double zahl2;
		double ergebnis;

		System.out.println("Bitte geben sie ihre erste Zahl ein!");

		zahl1 = tastatur.nextDouble();

		System.out.println("Bitte geben sie ihre zweite Zahl ein!");

		zahl2 = tastatur.nextDouble();

		ergebnis = zahl1 / zahl2;

		if (zahl2 == 0) {

			System.out.println("Nicht durch 0 Teilen!");

		}

		else {

			System.out.println("Das Ergebnis ist: " + ergebnis);

		}

	}

}