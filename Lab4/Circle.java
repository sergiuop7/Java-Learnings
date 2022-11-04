package Lab4;

class Circle
{
	private double radius;
	private String color;
	Circle(){
		radius=1.0;
		color="red";
	}
	Circle(double radius){
		this.radius=radius;
		color="red";
	}
	public double getRadius()
	 {
		 return radius;
	 }
	 public double getArea() 
	 {
		return 3.14*radius*radius;
	 }
	 @Override
	 public String toString()
     {
    	 return "The radius is "+radius+" and the color is "+color;
     }
}