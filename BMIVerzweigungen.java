package Verzweigungen;

import java.util.Scanner;

public class BMIVerzweigungen {

	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double masse;
		double groesse;
		double bmi;

		System.out.println("Bitte geben sie ihr Gewicht in kg ein!");

		masse = tastatur.nextDouble();

		System.out.println("Bitte geben sie ihre Groesse in m ein!");

		groesse = tastatur.nextDouble();

		bmi = masse / (groesse * groesse);

		System.out.println("Ihr BMI beträgt: " + bmi);

		if (bmi < 18.5) {

			System.out.println("Sie sind Untergewichtig!");

		}

		else if (bmi >= 25) {

			System.out.println("Sie sind Uebergewichtig!");

		}

		else {

			System.out.println("Sie sind Normalgewichtig!");

		}

	}

}