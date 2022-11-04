package Lab4;

class Square extends Rectangle
{
	//private double side;//shouldn't have an attribute, only the inherited ones
	Square(){super();}
	Square(double side){super();this.side=side;}
	Square(double side,String color,boolean filled)
	{
		super(side,side,color,filled);
	}
	double getSide()
	{
		return super.getLength();
	}
	void setSide(double side)
	{
		super.setWidth(side);
		super.setLength(side);
	}
	@Override
	void setWidth(double side)
	{
		super.setWidth(side);
	}
	@Override
	void setLength(double side)
	{
		super.setLength(side);
	}
	@Override
	public String toString()
	{
		return "A Square with side = "+side+" which is a subclass of "+super.toString();
	}

}
