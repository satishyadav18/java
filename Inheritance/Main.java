class A {
    void showA() {
        System.out.println("Class A method");
    }
}

class B extends A {
    void showB() {
        System.out.println("Class B method");
    }
}

class C extends B {
    void showC() {
        System.out.println("Class C method");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
