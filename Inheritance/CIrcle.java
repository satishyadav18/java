class Circ{
    public double radius;
    
    public double area(){
        return Math.PI * radius * radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }
}

class cylinder extends Circ{
    public double height;

    public double volume(){
        return area() * height;
    }
}

public class Circle{
    public static void main(String[] args){
        cylinder c = new cylinder();

        c.radius = 6.3;
        c.height = 10;

        System.out.println("Volume : "+c.volume());
        System.out.println("Area: "+c.area());
    }
}