import java.util.Scanner;

public class Aufgabe4_2 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		float seiteA = 0;
		float seiteB = 0;
		float seiteC = 0;

		System.out.println("Eingabe der Seite a: ");
		seiteA = myScanner.nextFloat();
		System.out.println("Eingabe der Seite b: ");
		seiteB = myScanner.nextFloat();
		System.out.println("Eingabe der Seite c: ");
		seiteC = myScanner.nextFloat();
		myScanner.close();

		if (seiteA == seiteB && seiteB == seiteC && seiteA == seiteC) {
			System.out.println("Das Dreiceck ist gleichseitig");
		} else if ((seiteA == seiteB || seiteB == seiteC) || seiteA == seiteC) {
			System.out.println("Das Dreiceck ist gleichschenklig");
		} else if (((Math.pow(seiteA, 2) + Math.pow(seiteB, 2) == Math.pow(seiteC, 2))
				|| (Math.pow(seiteB, 2) + Math.pow(seiteC, 2) == Math.pow(seiteA, 2)))
				|| (Math.pow(seiteA, 2) + Math.pow(seiteC, 2) == Math.pow(seiteB, 2))) {
			System.out.println("Das Dreiceck ist rechtwinklig");
		} else
			System.out.println("Das Dreiceck ist unregelm��ig");
		;
	}

}
