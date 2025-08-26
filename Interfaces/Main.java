interface MyInterface {
    // abstract method (must be implemented)
    void show();

    // default method using private method
    default void display() {
        helper();   // private method called
        System.out.println("Display method in interface");
    }

    // private helper method
    private void helper() {
        System.out.println("Private helper method inside interface");
    }
}

class Demo implements MyInterface {
    @Override
    public void show() {
        System.out.println("Implemented show() in class");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.display();  // calls default -> private helper
    }
}
