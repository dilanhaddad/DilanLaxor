import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangman {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        String[] Ord = {"program", "skola", "vinter", "ström", "ryggsäck", "skohorn", "metod", "vägutag", "startsida", "kontrol", "datormus", "klocka", "student", "bokstav"};
        //String arrayer för slumpade ord som ska gissas
        int liv = 0; 
        
       boolean StartaOm = true; //boolean för om man vill köra om
       while (StartaOm) { // while loop för om ska köra om
        metod(slump(Ord), liv);
 	   System.out.println(" \n \nVill du spela om? \nSvara 'nej' om du inte vill annars tryck ENTER " + "\n \n");
 	   input.nextLine();
 	   String start = input.nextLine();
        if (start.equals("nej")) {
			StartaOm = false;
			System.out.println("Tack för att du spelade!");
		}
        
       }
       
    }

    public static void metod(String RättOrd, int liv) {

        System.out.println("     HÄNGA GUBBE \n Gissa på en bokstav \n"); // huvud titeln



        ArrayList<Character> AnvändaBonstäver=new ArrayList<Character>();

        char[] OgissadeBokstäver = new char[RättOrd.length()]; // Detta är fyllningen för bokstäver som inte har blivit använda
                                                   
        int Gissning = 0;
while (Gissning < RättOrd.length()) {
            OgissadeBokstäver[Gissning] = '*';

            if (RättOrd.charAt(Gissning) == ' ') {
                OgissadeBokstäver[Gissning] = ' ';

            }
            Gissning++;// om bokstaven inte finns så blir gissing en mer
        }
        System.out.print(OgissadeBokstäver); //skiver ordet med * i början
        System.out.println(" Du har 7 liv till att börja med");

        while (liv != 8) {
            char bokstav = input.next().toLowerCase().charAt(0); // spelarens insättning av bokstav och så länge livet inte når 0 kan
                                                // spelaren fortsätta chansa
            if(AnvändaBonstäver.contains(bokstav)) {// om ordet redan har gissats med så börjar denna loopen om och säger till

                System.out.println("Du har redan använt denna bokstaven");
                continue;
            }

            AnvändaBonstäver.add(bokstav);
            
            if (liv == 0) {//en stor loop för att en visuell hänga gubbe ska visas
    			System.out.println();
    			System.out.println();
    			System.out.println("\n");}
            
            else if (liv == 1) {
    			System.out.println();
    			System.out.println();
    			System.out.println();
    			System.out.println();
    			System.out.println("___ ___");
    			System.out.println();
    			System.out.println("\n");}
            
    		
    			else if (liv == 2) {
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("___|___");
    			System.out.println("\n");
    		}
    		else if (liv == 3) {
    			System.out.println("   ____________");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   | ");
    			System.out.println("   |");
    			System.out.println("___|___");
    			System.out.println("\n");
    		}
    		else if (liv == 4) {
    			System.out.println("   ____________");
    			System.out.println("   |          _|_");
    			System.out.println("   |         /   \\");
    			System.out.println("   |        |     |");
    			System.out.println("   |         \\_ _/");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("___|___");
    			System.out.println("\n");
    		}
    		else if (liv == 5) {
    			System.out.println("   ____________");
    			System.out.println("   |          _|_");
    			System.out.println("   |         /   \\");
    			System.out.println("   |        |     |");
    			System.out.println("   |         \\_ _/");
    			System.out.println("   |           |");
    			System.out.println("   |           |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("___|___");
    			System.out.println("\n");
    		}
    		else if (liv == 6) {
    			System.out.println("   ____________");
    			System.out.println("   |          _|_");
    			System.out.println("   |         /   \\");
    			System.out.println("   |        |     |");
    			System.out.println("   |         \\_ _/");
    			System.out.println("   |           |");
    			System.out.println("   |           |");
    			System.out.println("   |          / \\ ");
    			System.out.println("   |         /   \\");
    			System.out.println("___|___      ");
    			
    			System.out.println("\n");
    		}
    		else if (liv == 7) {
    			System.out.println("   ____________");
    			System.out.println("   |          _|_");
    			System.out.println("   |         /   \\");
    			System.out.println("   |        |     |");
    			System.out.println("   |         \\_ _/");
    			System.out.println("   |          _|_");
    			System.out.println("   |         / | \\");
    			System.out.println("   |          / \\ ");
    			System.out.println("   |         /   \\");
    			System.out.println("___|___   ");
    			System.out.println("\n");   
    			
    		}
    		
    	
            System.out.println("\nDu misslyckades med att gissa hela ordet");
            System.out.println("Ordet var " + "'" + RättOrd + "'  \n");
            
            if (RättOrd.contains(bokstav + "")) {
                for (int y = 0; y < RättOrd.length(); y++) { //en loop som tittar om svaret innehåller det gissade talet och ersätter * med bokstaven
                    if (RättOrd.charAt(y) == bokstav) {
                        OgissadeBokstäver[y] = bokstav;
                    }
                }
            }
                else {
                    liv++; //Om gissning inte finns i ordet så blir liv ett mer
                }

            if(RättOrd.equals(String.valueOf(OgissadeBokstäver))) { //Kollar ifall hela ordet är rätt

                System.out.println(OgissadeBokstäver);
                System.out.println("Grattis du gissade hela ordet med " + liv + " fel gissningar");
                break;
            }


            System.out.print(OgissadeBokstäver);
            System.out.println("  Gissning " + liv + " av 8");

        }

    }
        	
         
           
        

    

    public static String slump(String[] lista) { //slumpar ord val
        Random rand = new Random(); 
        return lista[rand.nextInt(lista.length)];
    }



}









