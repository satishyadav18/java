import java.util.*;

class Rect{
    float length;
    float breadth;

    public float area(){
        return length * breadth;
    }

    public float perimeter(){
        return 2 * (length + breadth);
    }

    boolean isSquare(){
        if(length == breadth){
            return true;
        }
        return false;
    }
}

class Rectangle{
    public static void main(String[] args){
        Rect r = new Rect();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        r.length = sc.nextFloat();
        System.out.print("Enter the breadth: ");
        r.breadth = sc.nextFloat();

        float a = r.area();
        float p = r.perimeter();
        boolean b = r.isSquare();

        System.out.println("Area is: "+a);
        System.out.println("Perimeter is: "+p);
        System.out.println("Is a Square: "+b);
    }
}