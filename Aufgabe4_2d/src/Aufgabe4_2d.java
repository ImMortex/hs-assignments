
public class Aufgabe4_2d {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		if (a && b) {
			System.out.println(true);
		}

		// & vergleicht beide Werte vollst�ndig und f�hrt den Block bei wahr aus
		// && wenn bereits der erste Operant falsch ist, dann wird der Vergleich nicht
		// weiter durchgef�hrt

		int c = 0b11100;
		int d = 0b01111;
		System.out.println(c & d); //es wird der �berlauf der 5 Bits ausgegeben, da 28 + 15 = 31  �berlauf 12 sind
		
		int e = 15;
		int f = e << 2;
		int g = e >> 1;
		System.out.println(f);
		System.out.println(g);
	}

}
