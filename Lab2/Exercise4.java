package Lab2;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	
	System.out.println("Enter the number of elements:");
	int N = x.nextInt();
	int[]v = new int[N];
	System.out.println("Enter the elements of the vector:");
	for(int i=0; i<N; i++)
	{
		int a = x.nextInt();
		v[i]=a;
	}
	
	int maximul = v[0];
	for(int i=0; i<N; i++)
	{
		if(v[i]>maximul)
		{
			maximul=v[i];
		}
	}
	System.out.println("Maximum element : " + maximul);
	}
}
