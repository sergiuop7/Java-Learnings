package Lab5;

abstract class Shape{
	protected String color;
	  protected boolean filled;
	  Shape(){color="green";filled=true;}
	  Shape(String color,boolean filled)
	  {
		  this.color=color;
		  this.filled=filled;
	  }
	  String getColor() {return color;}
	  void setColor(String color) {this.color=color;}
	  boolean isFilled() {return filled;}
	  void setFilled(boolean filled)
	  {
		  this.filled=filled;
	  }
	  abstract double getArea();
	  abstract double getPerimeter();
	  @Override
	  public String toString()
	  {
		  if(filled==true)
	     return "A Shape with color of "+color+" and filled";
		  else
			 return "A Shape with color of "+color+" and not filled";
	  }
}