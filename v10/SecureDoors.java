import java.util.Scanner;
import java.util.ArrayList;

public class SecureDoors {
	public static void main (String[]args) {
		
	Scanner input = new Scanner (System.in);
	int howMany = input.nextInt();
	ArrayList<String> building = new ArrayList<>(); //denna listan haller koll pa vilka som har gatt ingenom dorren
	
	for (int i = 0; i < howMany; i++) { //loop for att bestamma om nagon gick ut eller in
        String track = input.next();
        String name = input.next();
        if (track.equals("entry")) { // for att om en person gick in
            System.out.print(name + " entered");
            if (building.contains(name))// for om nagot konstigt hander sa kommer det skrivas ut "anomaly"
                System.out.println(" (ANOMALY)");
            else {
                building.add(name);
                System.out.println();
            }
        }
            else {// for om nagon gick ut
                System.out.print(name + " exited");
                if (!building.contains(name))//om nagot konstigt sa skriv "anomaly" ut
                    System.out.println(" (ANOMALY)");
                else {
                    building.remove(name);
                    System.out.println();
                }	
            }
        
	}
	input.close();	// sa att man inte kan skriva in mer i konsolen
	}
}



