import java.util.*;

class Circle1{
    double radius;

    public double area(){
        return Math.PI * radius * radius;
    }

    public double Circumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args){
        Circle1 c = new Circle1();
        Circle1 d = new Circle1();
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        c.radius = sc.nextDouble();

        System.out.print("Enter the radius: ");
        d.radius = sc.nextDouble();
        
        double a = c.area();
        double p = c.Circumference();

        System.out.println("Area is: "+a);
        System.out.println("Circumference is: "+p);


        double A = d.area();
        double P = d.Circumference();

        System.out.println("Area2 is: "+A);
        System.out.println("Circumference2 is: "+P);
    }
}