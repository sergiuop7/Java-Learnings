package Lab2;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args)
	   {
	      int numberOne, numberTwo, n=0;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      numberOne = scan.nextInt();
	      System.out.print("Enter the Second Number: ");
	      numberTwo = scan.nextInt();
	      
	      while (numberOne < numberTwo) {
	    	  boolean flag = false;
	    	  for(int i = 2; i <= numberOne/2; ++i) {
	    	  if(numberOne % i == 0) {
	    	  flag = true;
	    	  break;
	    	  }
	    	  }
	    	  if (!flag) {
	    	  System.out.print(numberOne + " ");
	    	  n++;}
	    	  ++numberOne;
	    	}
	      System.out.print("\n" + n);
	   }
}
