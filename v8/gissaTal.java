import java.util.Scanner;

public class gissaTal
{
  public static void main(String args[])
  {
   Scanner input = new Scanner(System.in);
   
   int min = 0;
   int max = 100;
   int a = 1 + (int) (Math.random() * 99),
       guess, 
       count = 0;

   System.out.println("Gissa en siffra mellan 0 till 100?, du har 7 f�rs�k");

   while((guess = input.nextInt()) != a){
	   
     if (guess > max)
     {
       System.out.println("Talet �r under 100");
     }
     else if (guess < min)
     {
       System.out.println("Talet �r h�gre �n 0");
     }
     else if (guess > a){
    	 System.out.println("l�gre!");
     }
     else
     {
       System.out.println("h�gre!");
     }
     count++;
     if (count >= 7) 
     {
    	 System.out.println("Bra f�rs�kt men du gissade tyv�rr inte r�tt, talet var " + a);
    	 break;
     }
   }

   if(guess==a) {
	   System.out.println("R�tt, bra jobbat!. Du gissade med "+ count +" f�rs�k!");
   }
  }

}
