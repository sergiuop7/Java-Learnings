package Lab2;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) 
    {
        int n, mul = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any integer:");
        n = scan.nextInt();
        for(int i = 1; i <= n; i++)
        {
            mul = mul * i;
        }
        System.out.println("Factorial of without recursion "+n+" : " + mul);
        
        
        long factorial = multiplyNumbers(n);
        System.out.println("Factorial of " + n + " using recursion : " + factorial);

    }

	private static long multiplyNumbers(int n) {
		if (n >= 1)
            return n * multiplyNumbers(n - 1);
        else
            return 1;
	}
	
}
