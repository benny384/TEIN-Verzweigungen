package Verzweigungen;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double groessedbl;
		double gewichtdbl;
		double ergebnis;

		System.out.println("Bitte geben sie ihr Gewicht in kg ein!");

		gewichtdbl = tastatur.nextDouble();

		System.out.println("Bitte geben sie ihre Groesse in m ein!");

		groessedbl = tastatur.nextDouble();

		ergebnis = gewichtdbl / (groessedbl * groessedbl);

		System.out.println("Ihr BMI ist: " + ergebnis);

		if (ergebnis < 18.5) {
			System.out.println("Sie haben Untergewicht!");
		} else {
			if (ergebnis < 25) {
				System.out.println("Sie haben Normalgewicht!");
			} else {
				System.out.println("Sie haben Übergewicht");

			}
		}
	}
}