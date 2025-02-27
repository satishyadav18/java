class Rectangle{
    
    int length;
    int breadth;
    int x = 10;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void display(){
        System.out.println("Length of rectangle is: "+this.length);
        System.out.println("Breadth of rectangle is: "+this.breadth);
    }

}

class Cuboid extends Rectangle{
    int height;
    int x = 20;

    public Cuboid(int l, int b, int h){
        super(l,b);
        height = h;
    }

    void display(){
        System.out.println("Super x: "+super.x);
        System.out.println("Child x: "+x);
        System.out.println("Length of cuboid: "+length);
        System.out.println("Breadth of cuboid: "+breadth);
        System.out.println("Height of cubid: "+height);
        
    }
}


public class ThisSuper{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5,4);
        Rectangle r2 = new Rectangle(8,3);
        r1.display();
        r2.display();

        Cuboid c = new Cuboid(12,9,20);
        c.display();
    }
}