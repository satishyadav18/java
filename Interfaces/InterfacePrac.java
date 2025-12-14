interface t1 {
    void method();
    void anotherMethod();
}

class t2 implements t1 {

    @Override
    public void method() {
        System.out.println("Method implemented");
    }

    @Override
    public void anotherMethod() {
        System.out.println("Another method implemented");
    }

    public void t2method() {
        System.out.println("t2 specific method");
    }   
}

public class InterfacePrac {
    public static void main(String[] args) {
        t1 obj = new t2();  // t1 interface reference to t2 object ..... t1 is acting like superclass here
        obj.method();
        obj.anotherMethod();
        //obj.t2method();  // not allowed as t1 doesn't have this method

        t2 obj2 = new t2();
        // obj2.method();
        // obj2.anotherMethod();
        obj2.t2method();
    }
}