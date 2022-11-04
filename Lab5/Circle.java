package Lab5;

class Circle extends Shape
{
	protected double radius;
	Circle(){super();radius=1.0;}
	Circle(double radius){super();this.radius=radius;}
	Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
		
	}
	double getRadius() {
		return radius;
	}
    void setRadius(double radius) {this.radius=radius;}
    double getArea() {return 3.14*radius*radius;}
    double getPerimeter() {return 2*3.14*radius;}
    @Override
    public String toString()
    {
    	return "A Circle with radius ="+radius+" which is a subclass of "+super.toString();
    }
    
}
