package �vningsuppgifter;

import java.util.Scanner;

public class uppgift {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double tal = 1;
		double summa = 0;
		
		System.out.println("skriv n�gra nummer, skriv sedan talet 0 f�r att f� summan av alla nummer");
		
		while (tal != 0) {
			tal = input.nextDouble();
			
			summa = summa + tal;
			
			
		} 

		System.out.println(summa);
	

}
}
