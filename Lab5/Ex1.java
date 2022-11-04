package Lab5;

public class Ex1 {
	
	public static void main(String[] args) 
	{
	Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(2);
    shapes[1] = new Rectangle(5,7);
    shapes[2] = new Square(4);

    for(int i = 0; i < shapes.length; i++) {
        System.out.println("Area of shape " + (i+1) + ": " + shapes[i].getArea());
        System.out.println("Perimeter of shape " + (i+1) + ": " + shapes[i].getPerimeter());
    }
	
}}