abstract class Super{  // cannot create object of abstract class
    public Super(){
        System.out.println("Super class constructor");
    }

    public void display1(){
        System.out.println("Display1 method in Super class");
    }

    abstract public void display2();  //undefined method and such class is only used for inheritance
}

class Sub extends Super{  
    @Override    // must override abstract class method to make it concrete
    public void display2(){
        System.out.println("Display2 method in Sub class");
    }
}

public class AbstExpl{
    public static void main(String[] args){
        Super s = new Sub();
        s.display1();
        s.display2();
    }
}