package Verzweigungen;

import java.util.Scanner;

public class Handytarif {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		 
		 double basispreis = 22.98;
		 double frei = 30;
		 double preisgespraechsmin = 0.248;
		 double minuten;
		 double minutenbezahlen;
		 double rechnung;
		 double rechnung1;
		 
		 System.out.println("Bitte geben sie ihre Gespraechsminuten ein!");
		 minuten = scanner.nextDouble();
		 
		 minutenbezahlen = frei - minuten;
		 
		 if (minutenbezahlen > 0) {
			 System.out.println("Sie müssen keine Extragebuehren bezahlen!");
			 rechnung = basispreis;
			 System.out.println("Ingesamt müssen sie " + rechnung + " bezahlen");
		 } else if (minutenbezahlen < 0) {
			 minutenbezahlen = minutenbezahlen * -1;
			 System.out.println("Sie muessen " + minutenbezahlen + " Minuten extra Zahlen");
			 rechnung = minutenbezahlen * minuten + basispreis;
			 System.out.println("Sie muessen " + rechnung + "  Zahlen");


		 }

	}

}
