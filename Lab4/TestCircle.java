package Lab4;

public class TestCircle {
	
	public static void main(String args[])
	{
		Circle c1= new Circle();
		Circle c2= new Circle(5);
		System.out.println(c1);
   	 System.out.println(c2);
   	 System.out.println(c2.getRadius());
   	System.out.println(c1.getArea());
	}
	
}