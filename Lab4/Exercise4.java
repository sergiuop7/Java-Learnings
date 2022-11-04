package Lab4;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String args[])
	{
		Author[] a=new Author[2];
		int i;
		Scanner in = new Scanner(System.in);
		for (i=0;i<a.length;i++)
		{
			String name=in.nextLine();
		    String email=in.nextLine();
		    char gender=in.nextLine().charAt(0);
		 a[i]=new Author(name,email,gender);
		 	
		}
		Book1 b1=new Book1("The Steam House",a,30.5);
		b1.printAuthors();
		System.out.println(b1);
	}

}