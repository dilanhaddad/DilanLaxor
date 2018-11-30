package övningsuppgifter;

import java.util.Scanner;

public class uppgift3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double tal = 1;
		double produkt = 1;
		double count = 0;
		
		System.out.println("skriv några nummer de kommer multipliceras med varandra");
		
	while (produkt <= 100000) {
		
	
			tal = input.nextDouble();
			
			produkt = produkt * tal;
			
			count = count + 1;
			
			if (count == 10) {
				
				break;
			}
			
	}
		 

		System.out.println(produkt);
	

}
}