package Verzweigungen;

import Prog1Tools.IOTools;

public class Ostern {
	public static void main(String[] args) {
		
		int jahr, monat, tag;
		int a, b, c, d, e, m, n, s;
		
		jahr = IOTools.readInteger("Jahr > ");
		a = jahr % 19;
		b = jahr % 4;
		c = jahr % 7;
		m = (8 * (jahr / 100) + 13) / 25 - 2;
		s = jahr / 100 - jahr / 400 - 2;
		m = (15 + s - m) % 30;
		n = (6 + s) % 7;
		d = (m + 19 * a) % 30;
		
		
		if (d == 29)
			d = 28;
		else if ((d == 28) && (a >= 11))
			d = 27;
		e = (2 * b + 4 * c + 6 * d + n) % 7;
		tag = 21 + d + e + 1;
		if (tag > 31) {
			tag = tag % 31;
			monat = 4;
		} else
			monat = 3;
		
		
		System.out.println("Im Jahr " + jahr + " ist Ostern am " + tag + "." + monat + ".");
	}
}