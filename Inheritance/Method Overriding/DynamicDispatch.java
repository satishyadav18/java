class Super {
    public void display1() {
        System.out.println("Display1 from Super class");
    }
    public void display2() {
        System.out.println("Display2 from Super class");
    }
}

class Sub extends Super {
    @Override
    public void display1() {
        System.out.println("Display1 from Sub class");
    }

    public void display3() {
        System.out.println("Display3 from Sub class");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Super superObj = new Super();
        Super subObj = new Sub();  // Super class reference to Sub class object  i.e. dynamic dispatch

        // Sub sub = new Sub();
        // sub.display1(); // Calls Sub's display1
        // sub.display2(); // Calls Super's display2 since it's not overridden in Sub
        // sub.display3(); // Calls Sub's display3

        superObj.display1(); // Calls Super's display1
        superObj.display2(); // Calls Super's display2


        subObj.display1();   // Calls Sub's display1 due to dynamic dispatch
        subObj.display2();   // Calls Super's display2 since it's not overridden in Sub
        // subObj.display3(); // This line would cause a compile-time error since display3 is not in Super
    }
}