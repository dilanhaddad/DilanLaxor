import java.util.Scanner;
import java.util.ArrayList;

public class SecureDoors {
	public static void main (String[]args) {
		
	Scanner input = new Scanner (System.in);
	System.out.println("Hur många händelser ska ske?");
	int howMany = input.nextInt();
	ArrayList<String> building = new ArrayList<>(); //denna listan håller koll på vilka som har gått ingenom dörren
	
	for (int i = 0; i < howMany; i++) { //loop för att bestämma om personen gick in eller ut 
        String track = input.next();
        String name = input.next();
        if (track.equals("entry")) {
            System.out.print(name + " entered");
            if (building.contains(name))
                System.out.println(" (ANOMALY)");
      
                }	
            }
        
	}
	
	}




