import java.util.Scanner;

public class gissaTal
{
	public static void main(String args[]) {
		boolean restart = true;
		while (restart) { // en loop f�r om man vill spela om
		
		int max = 0;
		int min = 0;
		int guess = 0, count = 1, countMax = 0;
		String start;
		System.out.println(
				"V�lj en niv� \n \nNiv� 1: 10 gissningar, maxtal 50 \nNiv� 2: 10 gissnigar, maxtal 100 \nNiv� 3: 16 gissningar, maxtal 200");
		// H�r har jag skrivit s� att man kan veta vad man har f�r vin�, hur m�nga gissningar och mellan vilka tal
		Scanner input = new Scanner(System.in);

		int levels = input.nextInt();

		while (levels != 1 && levels != 2 && levels != 3) {
			System.out.println("Du m�ste v�lja en av niv�er");

			levels = input.nextInt();
			// Detta �r en loop f�r att man inte ska kunna v�lja en niv� h�gre �n 3
		}
		switch (levels) {
		case 1:
			countMax = 10;
			min = 0;
			max = 50;
			break;
		case 2:
			countMax = 10;
			min = 0;
			max = 100;
			break;
		case 3:
			countMax = 16;
			min = 0;
			max = 200;
			break;
		default:
			System.out.println("Detta �r inte en niv�");
			// detta �r en switch case f�r niv�erna
		}
		System.out.println(
				"Du valde niv� " + levels + ", du har " + countMax + " gissningar, mellan talen " + min + " och " + max);
		// detta s�ger hur m�nga gissningar och mellan vilka tal f�r din valda niv�

		int a = 1 + (int) (Math.random() * max);

		while ((guess = input.nextInt()) != a) {

			if (guess > max) {
				System.out.println("Talet �r under ");
			} else if (guess < min) {
				System.out.println("Talet �r h�gre �n 0");
			} else if (guess > a) {
				System.out.println("l�gre!");
			} else {
				System.out.println("h�gre!");
			}
			// detta �r f�r att s�ga om talet �r f�r h�gt eller l�gt
			count++;
			if (count >= countMax) {
				System.out.println("Bra f�rs�kt men du gissade tyv�rr inte r�tt, talet var " + a);
				break;
			}
		}

		if (guess == a) {
			System.out.println("R�tt, bra jobbat!. Du gissade med " + count + " f�rs�k!");
			// detta s�get om du har r�tt och hur m�nga g�nger du gissade
		} 
		System.out.println("\n");//om du vill k�ra om s� ska du svara nej
		System.out.println("Vill du spela om? \nSvara 'nej' om du inte vill starta om");
		input.nextLine(); //buffer
		start = input.nextLine();
		if (start.equals("nej")) {
			restart = false;
			System.out.println("Tack f�r att du spelade!");
		}
	}

}
}
