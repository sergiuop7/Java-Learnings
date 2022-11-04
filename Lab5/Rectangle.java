package Lab5;

class Rectangle extends Shape
{
	protected double width;
	protected double length;
	Rectangle(){super();width=1;length=1;}
	Rectangle(double width,double length){super();this.width=width;this.length=length;}
	Rectangle(double width,double length, String color,boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
		
	}
	double getWidth() {return width;}
	void setWidth(double width) {this.width=width;}
	double getLength() {return length;}
	void setLength(double length) {this.length=length;}
	double getArea() 
	{
		return width*length;
	}
	double getPerimeter()
	{
		return 2*width+2*length;
	}
	@Override
	public String toString()
	{
		return "A Rectangle with width = "+width+" and length = "+length+" which is a subclass of "+super.toString();
	}
	
}