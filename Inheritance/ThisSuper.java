class Rectangle{
    
    int length;
    int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void display(){
        System.out.println("Length of rectangle is: "+this.length);
        System.out.println("Breadth of rectangle is: "+this.breadth);
    }

}

public class ThisSuper{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5,4);
        Rectangle r2 = new Rectangle(8,3);
        r1.display();
        r2.display();
    }
}