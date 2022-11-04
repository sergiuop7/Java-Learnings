package Lab4;

class Cylinder extends Circle
{
	private double height;
	Cylinder()
	{
		super();height=1;
	}
	Cylinder(double radius)
	{
		super(radius);
		height=1;
	}
	Cylinder(double radius,double height)
	{
		super(radius);
		this.height=height;
	}
	@Override
	public double getArea()
	{
		super.getArea();
		return super.getRadius()*3.14*(super.getRadius()+height);
		
	}
	double getHeight()
	{
		return height;
	}
	double getVolume()
	{
		return getArea()*height;
	}
	
	
}
