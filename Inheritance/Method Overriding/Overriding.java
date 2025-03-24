class Super{
    public void display(){
        System.out.println("Super class");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub class");
    }
}


public class Overriding{
    public static void main(String[] args){
        
        Super su = new Super(); //super class object
        su.display();   //Super class

        Sub sb = new Sub(); //sub class object
        sb.display();   //Sub class

        Super s = new Sub(); //Dynamic method dispatch
        s.display();       //sub class
    }
}