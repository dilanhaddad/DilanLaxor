import java.util.Scanner;
import java.util.ArrayList;

public class SecureDoors {
	public static void main (String[]args) {
		
	Scanner input = new Scanner (System.in);
	System.out.println("Hur m�nga h�ndelser ska ske?");
	int howMany = input.nextInt();
	ArrayList<String> building = new ArrayList<>(); //denna listan h�ller koll p� vilka som har g�tt ingenom d�rren
	
	for (int i = 0; i < howMany; i++) { //loop f�r att best�mma om personen gick in eller ut 
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




