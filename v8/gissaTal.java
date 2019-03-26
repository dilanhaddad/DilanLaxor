import java.util.Scanner;

public class gissaTal
{
	public static void main(String args[]) {
		boolean restart = true;
		while (restart) { // en loop för om man vill spela om
		
		int max = 0;
		int min = 0;
		int guess = 0, count = 1, countMax = 0;
		String start;
		System.out.println(
				"Välj en nivå \n \nNivå 1: 10 gissningar, maxtal 50 \nNivå 2: 10 gissnigar, maxtal 100 \nNivå 3: 16 gissningar, maxtal 200");
		// Här har jag skrivit så att man kan veta vad man har för vinå, hur många gissningar och mellan vilka tal
		Scanner input = new Scanner(System.in);

		int levels = input.nextInt();

		while (levels != 1 && levels != 2 && levels != 3) {
			System.out.println("Du måste välja en av nivåer");

			levels = input.nextInt();
			// Detta är en loop för att man inte ska kunna välja en nivå högre än 3
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
			System.out.println("Detta är inte en nivå");
			// detta är en switch case för nivåerna
		}
		System.out.println(
				"Du valde nivå " + levels + ", du har " + countMax + " gissningar, mellan talen " + min + " och " + max);
		// detta säger hur många gissningar och mellan vilka tal för din valda nivå

		int a = 1 + (int) (Math.random() * max);

		while ((guess = input.nextInt()) != a) {

			if (guess > max) {
				System.out.println("Talet är under ");
			} else if (guess < min) {
				System.out.println("Talet är högre än 0");
			} else if (guess > a) {
				System.out.println("lägre!");
			} else {
				System.out.println("högre!");
			}
			// detta är för att säga om talet är för högt eller lågt
			count++;
			if (count >= countMax) {
				System.out.println("Bra försökt men du gissade tyvärr inte rätt, talet var " + a);
				break;
			}
		}

		if (guess == a) {
			System.out.println("Rätt, bra jobbat!. Du gissade med " + count + " försök!");
			// detta säget om du har rätt och hur många gånger du gissade
		} 
		System.out.println("\n");//om du vill köra om så ska du svara nej
		System.out.println("Vill du spela om? \nSvara 'nej' om du inte vill starta om");
		input.nextLine(); //buffer
		start = input.nextLine();
		if (start.equals("nej")) {
			restart = false;
			System.out.println("Tack för att du spelade!");
		}
	}

}
}
