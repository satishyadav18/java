import java.util.Scanner;

interface Shape{
    double pie = 3.14;
    void findArea();
}

class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public void findArea(){
        System.out.println("Area of circle is: "+pie*radius*radius);
    }
}

class Rectangle implements Shape{
    double length;
    double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void findArea(){
        System.out.println("Area of Rectangle is: "+length*breadth);
    }
}

public class Shape_S{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter the length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        
        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(length, breadth);

        circle.findArea();
        rectangle.findArea();
    }
}