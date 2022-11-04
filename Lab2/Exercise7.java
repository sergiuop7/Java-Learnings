package Lab2;

import java.util.Scanner;
import java.util.Random;

public class Exercise7 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int the_number = r.nextInt(10);
		
		System.out.println("Try and guess the number!");
		
		Scanner in = new Scanner(System.in);
		
		int number_of_guesses=3,value=0;
		
		int N = in.nextInt();
		
		
		 while(number_of_guesses>0)	
		{if(N==the_number)
			{System.out.println("Congratulations, you guessed the number!");value=1;break;}
		else
			if(N<the_number)
				{System.out.println("The number is higher!");number_of_guesses--; }
			else
				if(N>the_number)
					{System.out.println("The number is lower!");number_of_guesses--;
					 }
			
		if(number_of_guesses==0 && value!=1)
			System.out.println("You lost!");
		N = in.nextInt();
	    }
		
		System.out.println("The number was "+the_number);
	}

	
}