import java.util.Scanner;

public class gissaTal
{
  public static void main(String args[]){
	  int max=0;
	  int min=0;
	  int guess = 0, count = 0, countMax = 0;
	  System.out.println("V�lj en niv� \nNiv�er: \nNiv� 1: 10 gissningar, maxtal 50 \nNiv� 2: 10 gissnigar, maxtal 100 \nNiv� 3: 16 gissningar, maxtal 200" );
	  
	   Scanner input = new Scanner(System.in);
	
	   int levels = input.nextInt();
	 
	  while (levels != 1 && levels != 2 && levels != 3) {
		  System.out.println("Du m�ste v�lja en av niv�er");
		  
		  levels = input.nextInt();
		
	  }
	  switch(levels) {
	  case 1:
		  countMax=10;
		  min=0;
		   max = 50;
		   break;
	  case 2:
		  countMax=10;
		  min=0;
		   max = 100;
		   break;
	  case 3:
		  countMax=16;
		  min=0;
		   max = 200;
		   break;
	  default:
		  System.out.println("Detta �r inte en niv�");
	  }
	  System.out.println("Du valde niv� " + levels + ", du har " + count + " gissningar, mellan talen " + min + " och " + max);
	  
   
   
   int a = 1 + (int) (Math.random() * 99);

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
     if (count >= countMax) 
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
