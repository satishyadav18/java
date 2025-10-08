package mypack1;

public class Demo3 extends Demo1 {
    public void show() {
        //System.out.println(a + b + c + d); // b is private, so it cannot be accessed here
        System.out.println(a + c + d); // without b
    }
}

//with b
// javac -d . Demo3.java
// Demo3.java:5: error: b has private access in Demo1