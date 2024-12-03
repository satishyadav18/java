class RectangleTest{
    private double length; 
    private double breadth;


    //constructors
    public RectangleTest(){
        length = 1;
        breadth = 1;
    }

    public RectangleTest(double l, double b){
        setLength(l);
        setBreadth(b);
    }

    public RectangleTest(double s){
        length = breadth = s;
    }

    //methods
    public double getLength(){
        return length;
     }
    
    public double getBreaath(){
        return breadth;
    }
    
    public void setLength(double l){
        if(l >= 0){
            length = l;
        }
        else{
            length = 0;
        }
    }

    public void setBreadth(double b){
        if(b >= 0){
            breadth = b;
        }
        else{
            breadth = 0;
        }
    }

    public double area(){
        return getLength() * getBreaath();
    }

    public double perimeter(){
        return 2 * (getLength() + getBreaath());
    }

    boolean isSquare(){
        if(length == breadth){
            return true;
        }
        return false;
    }
}

public class RectConst{
    public static void main(String[] args){
        RectangleTest r = new RectangleTest(-7, -5);
        System.out.println("Area is: "+r.area());
        System.out.println("Perimeteris: "+r.perimeter());
        System.out.println("Is Square: "+r.isSquare());
    }
}