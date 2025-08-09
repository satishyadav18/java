abstract class Super{
    public Super(){
        System.out.println("Super class constructor");
    }

    public void display1(){
        System.out.println("Display1 method in Super class");
    }

    abstract public void display2();
}

class Sub extends Super{
    @Override
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