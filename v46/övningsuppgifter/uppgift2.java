package �vningsuppgifter;

import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String ord ="HEj";
		String slut = "Nu har du avslutat";
		
		System.out.println("skriv n�gra meningar/ ord, skriv sedan ordet EXIT f�r att f� tillbaka alla ord");
		
		while (!ord.equals("EXIT")) {
			ord = input.nextLine();
			
			if (ord.equals("EXIT")) {
				System.out.println(slut);
			}

			
			
			
		} 

		
	

}
}