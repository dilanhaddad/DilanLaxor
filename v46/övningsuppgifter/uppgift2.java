package övningsuppgifter;

import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String ord ="HEj";
		String slut = "Nu har du avslutat";
		
		System.out.println("skriv några meningar/ ord, skriv sedan ordet EXIT för att få tillbaka alla ord");
		
		while (!ord.equals("EXIT")) {
			ord = input.nextLine();
			
			if (ord.equals("EXIT")) {
				System.out.println(slut);
			}

			
			
			
		} 

		
	

}
}