package Verzweigungen;

import java.util.Scanner;

public class Terrarium {
	
	public static void main(String[] args) {
		
		Scanner tastatur = new Scanner(System.in);

	 double temperatur;
	 
	 System.out.println("Bitte geben sie die Temperatur im Terrarium an");
	 
	 temperatur = tastatur.nextDouble();
	 
	 if (temperatur >= 25 && temperatur <= 35) {
		 System.out.println("Dein Tier fühlt sich sehr wohl");
	 } else {
		 if (temperatur > 35) {
			 System.out.println("Es ist viel zu warm!");
		 }
	 }
	  {
		 if (temperatur < 25) {
			 System.out.println("Es ist viel zu kalt!");
		 }
	 }
	 

	}

}
