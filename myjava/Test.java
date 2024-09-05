class Parent{
    void method(){
        System.out.println("inside Parent method");
    }
}

class Child extends Parent{
    void method(){
        System.out.println("inside Child method");
    }
}

public class Test{
    public static void main(String[] args) {
        Parent p = new Child();
        p.method();
    }
}