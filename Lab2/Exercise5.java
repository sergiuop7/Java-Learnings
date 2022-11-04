package Lab2;

import java.util.Random;

public class Exercise5 {
	public static void main(String[] args){ 
	System.out.println("Hi there!"); 
	Random r = new Random();
	
	int aux=0;
	
	int[] a = new int[10];

	for (int i=0;i<a.length;i++){

		a[i] = r.nextInt(100);

	}

		for(int i=0;i<a.length;i++){ 
			System.out.print("a["+i+"]="+a[i]+" ");
	}
		for (int i = 0; i < a.length; i++) {
		      for (int j = 1; j < (a.length - i); j++) {
		        if (a[j - 1] > a[j]) {
		          //Code to swap the elements
		          aux = a[j - 1];
		          a[j - 1] = a[j];
		          a[j] = aux;
		        }
		      }
		    }
		System.out.println("\n");
		
		System.out.println("Array on which we apply Bubble Sort: ");
	    for (int i = 0; i < a.length; i++) {
	      System.out.print("a["+i+"]="+a[i]+" ");
	    }
	    System.out.println();
	}
}
