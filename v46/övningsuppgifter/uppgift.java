package övningsuppgifter;

import java.util.Scanner;

public class uppgift {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double tal = 1;
		double summa = 0;
		
		System.out.println("skriv några nummer, skriv sedan talet 0 för att få summan av alla nummer");
		
		while (tal != 0) {
			tal = input.nextDouble();
			
			summa = summa + tal;
			
			
		} 

		System.out.println(summa);
	

}
}
