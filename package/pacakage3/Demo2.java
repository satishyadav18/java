package mypack1;

//same package non subclass
public class Demo2 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        System.out.println(d.a+d.c+d.d); // b is private, so it cannot be accessed here
    }
}

//javac -d . Demo2.java
// Demo2.java:6: error: b has private access in Demo1
//         System.out.println(d.a+d.b+d.c+d.d);