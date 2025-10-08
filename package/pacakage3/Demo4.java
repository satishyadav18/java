package mypack2;
import mypack1.Demo1;

public class Demo4 extends Demo1 {
    public void show() {
      //  System.out.println(a + b + c + d); //a and b will give error 
        System.out.println(c + d); // without a and b
    }
}

// javac -d . Demo4.java
// Demo4.java:6: error: a is not public in Demo1; cannot be accessed from outside package
//         System.out.println(a + b + c + d);
//                            ^
// Demo4.java:6: error: b has private access in Demo1
//         System.out.println(a + b + c + d);
//                                ^
// 2 errors