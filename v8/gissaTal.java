import java.util.Scanner;

public class gissaTal
{
  public static void main(String args[])
  {
   Scanner keyboard = new Scanner(System.in);
   
   int min = 0;
   int max = 100;
   int a = 1 + (int) (Math.random() * 99),
       guess, 
       count = 0;

   System.out.println("Gissa en siffra mellan 0 till 100 ?");

   while((guess = keyboard.nextInt()) != a){
	   
     if (guess > max)
     {
       System.out.println("Ditt tal m�ste vara under 100");
     }
     else if (guess < min)
     {
       System.out.println("Ditt tal m�ste vara h�gre �n 0");
     }
     else if (guess > a){
    	 System.out.println("l�gre!");
     }
     else
     {
       System.out.println("h�gre!");
     }
     count++;
   }

   System.out.println("R�tt, bra jobbat!. Du gissade med "+ count +" f�rs�k!");
  }

}
