abstract class Shape {
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape {
    double radius;
    
    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

}


class Rectangle extends Shape {
    int length;
    int breadth;
    
    @Override
    public double perimeter(){
        return 2 * (length + breadth);
    }

    @Override
    public double area(){
        return length * breadth;
    }

}


public class AbstShape{
    public static void main(String[] args){
        Circle c = new Circle();
        c.radius = 5.5; 
   
        // System.out.println(c.perimeter());
        // System.out.println(c.area());


        // using super class referece pointing on sub class
        Shape s = c;                  
        System.out.println(s.perimeter());
        System.out.println(s.area());


        Rectangle r = new Rectangle();
        r.length = 7;
        r.breadth = 5;

        System.out.println(r.perimeter());
        System.out.println(r.area());
    }
}