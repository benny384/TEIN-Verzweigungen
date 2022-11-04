package Verzweigungen;

public class Falsch {

	public static void main(String[] args) {
		int x = 0, y = 4;
		// Beispiel A
		if (x < 5) {
		} else {
			if (x < 0) {
			System.out.println("x < 0");
		}
			else
				System.out.println("x >= 5");
		// Beispiel B
		if (x > 0)
			System.out.println("ok! x > 0");
		else {
		System.out.println("1/x = " + (1 / x));
		}
		// Beispiel C
		if (x > 0)
		System.out.println("1/x = " + (1 / x));
		// Beispiel D
		if (y > x) {
			// vertausche x und y
			x = y;
			y = x;
		}
		System.out.println("x = " + x + " y = " + y);
	}
}
}