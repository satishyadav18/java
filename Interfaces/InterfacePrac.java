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
        t1 obj = new t2();
        obj.method();
        obj.anotherMethod();
        

        t2 obj2 = new t2();
        // obj2.method();
        // obj2.anotherMethod();
        obj2.t2method();
    }
}