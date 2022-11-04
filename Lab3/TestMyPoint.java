package Lab3;

public class TestMyPoint {
	
	public static void main(String args[])
	{
	
		MyPoint m1=new MyPoint();
		MyPoint m2=new MyPoint(7,8);
		System.out.println(m2);
		System.out.println("The distance between m1 and m2 is "+m1.distance(m2));
		System.out.println("The distance between m2 and the given point is "+m2.distance(7,8));
		
	}

}