package Verzweigungen;

import java.time.LocalDate;
import java.util.Scanner;


public class Geburtstagsrechner {

	public static void main(String[] args) {
		
		Scanner tastatur = new Scanner(System.in);

		LocalDate todaysDate = LocalDate.now();
		
		int tag;
		int monat;
		int jahr;
		
		int gebtag;
		int gebmonat;
		int gebjahr;
		
		int ergebnis;
		
		System.out.println("Bitte geben sie ihren Geburts Tag an!");
		gebtag = (int) tastatur.nextDouble();
		
		System.out.println("Bitte geben sie ihren Geburts Monat an!");
		gebmonat = (int) tastatur.nextDouble();
		
		System.out.println("Bitte geben sie ihr Geburts Jahr an!");
		gebjahr = (int) tastatur.nextDouble();
		
		System.out.println("Bitte geben sie den akutellen Tag an!");
		tag = (int) tastatur.nextDouble();
		
		System.out.println("Bitte geben sie den akutellen Monat an!");
		monat = (int) tastatur.nextDouble();
		
		System.out.println("Bitte geben sie das akutelle Jahr an!");
		jahr = (int) tastatur.nextDouble();
		
		ergebnis = jahr - gebjahr;
		
		if (tag < gebtag) {
			System.out.println("Sie sind: " + (ergebnis -1 ) + " Jahre Alt");
		} else {
			System.out.println("Sie sind: " + ergebnis + " Jahre Alt");
		}
	

	}

}
