import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangman {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        String[] Ord = {"program", "skola", "vinter", "str�m", "ryggs�ck", "skohorn", "metod", "v�gutag", "startsida", "kontrol", "datormus", "klocka", "student", "bokstav"};
        //String arrayer f�r slumpade ord som ska gissas
        int liv = 0; 
        
       boolean StartaOm = true; //boolean f�r om man vill k�ra om
       while (StartaOm) { // while loop f�r om ska k�ra om
        metod(slump(Ord), liv);
 	   System.out.println(" \n \nVill du spela om? \nSvara 'nej' om du inte vill annars tryck ENTER " + "\n \n");
 	   input.nextLine();
 	   String start = input.nextLine();
        if (start.equals("nej")) {
			StartaOm = false;
			System.out.println("Tack f�r att du spelade!");
		}
        
       }
       
    }

    public static void metod(String R�ttOrd, int liv) {

        System.out.println("     H�NGA GUBBE \n Gissa p� en bokstav \n"); // huvud titeln



        ArrayList<Character> Anv�ndaBonst�ver=new ArrayList<Character>();

        char[] OgissadeBokst�ver = new char[R�ttOrd.length()]; // Detta �r fyllningen f�r bokst�ver som inte har blivit anv�nda
                                                   
        int Gissning = 0;
while (Gissning < R�ttOrd.length()) {
            OgissadeBokst�ver[Gissning] = '*';

            if (R�ttOrd.charAt(Gissning) == ' ') {
                OgissadeBokst�ver[Gissning] = ' ';

            }
            Gissning++;// om bokstaven inte finns s� blir gissing en mer
        }
        System.out.print(OgissadeBokst�ver); //skiver ordet med * i b�rjan
        System.out.println(" Du har 7 liv till att b�rja med");

        while (liv != 8) {
            char bokstav = input.next().toLowerCase().charAt(0); // spelarens ins�ttning av bokstav och s� l�nge livet inte n�r 0 kan
                                                // spelaren forts�tta chansa
            if(Anv�ndaBonst�ver.contains(bokstav)) {// om ordet redan har gissats med s� b�rjar denna loopen om och s�ger till

                System.out.println("Du har redan anv�nt denna bokstaven");
                continue;
            }

            Anv�ndaBonst�ver.add(bokstav);
            
            if (liv == 0) {//en stor loop f�r att en visuell h�nga gubbe ska visas
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
            System.out.println("Ordet var " + "'" + R�ttOrd + "'  \n");
            
            if (R�ttOrd.contains(bokstav + "")) {
                for (int y = 0; y < R�ttOrd.length(); y++) { //en loop som tittar om svaret inneh�ller det gissade talet och ers�tter * med bokstaven
                    if (R�ttOrd.charAt(y) == bokstav) {
                        OgissadeBokst�ver[y] = bokstav;
                    }
                }
            }
                else {
                    liv++; //Om gissning inte finns i ordet s� blir liv ett mer
                }

            if(R�ttOrd.equals(String.valueOf(OgissadeBokst�ver))) { //Kollar ifall hela ordet �r r�tt

                System.out.println(OgissadeBokst�ver);
                System.out.println("Grattis du gissade hela ordet med " + liv + " fel gissningar");
                break;
            }


            System.out.print(OgissadeBokst�ver);
            System.out.println("  Gissning " + liv + " av 8");

        }

    }
        	
         
           
        

    

    public static String slump(String[] lista) { //slumpar ord val
        Random rand = new Random(); 
        return lista[rand.nextInt(lista.length)];
    }



}









