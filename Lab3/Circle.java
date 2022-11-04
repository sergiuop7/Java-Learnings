package Lab3;

public class Circle {
    
    private double radius;
    private String color;
    
    Circle(double radius){
        this.radius = radius;
        System.out.println("Circle with radius " +radius+" built.");
    }
    
    Circle(double radius, String color){
        this.radius = radius;
        this.color = "red";
        System.out.println("Circle with radius " +radius+" and color " + color + " built.");
    }
    
    void getRadius() {
        System.out.println("Radius =  " +radius);
    }
    
    void getArea() {
        Double area = Math.PI * radius * radius;        
        System.out.println("Area = "+area);
    }    
}