package övningsuppgifter;

import java.util.Scanner;

public class uppgift6 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int x = 0;
		System.out.println("ange en tal för hur många baser pyramid ska ha");
			x = input.nextInt();
			  for(int i=0;i<x;i++) {
		             for(int j=0;j<x-i;j++) {

		                 System.out.print(" ");
		             }
		            for(int k=0;k<=i;k++) {
		                System.out.print("x ");
		            }
		            System.out.println();
		            input.close();
		        }

}

}
