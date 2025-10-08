import mypack1.Demo1;


//Test class is outside the package
public class Test {
    public static void main(String[] args) {
        Demo1 d = new Demo1();

        d.display();
        //System.out.println(d.a+d.b+d.c+d.d); // b is private, a is default so it will give error
    
    }
}

//javac Test.java
// Test.java:10: error: a is not public in Demo1; cannot be accessed from outside package
//         System.out.println(d.a+d.b+d.c+d.d); 
//                             ^
// Test.java:10: error: b has private access in Demo1
//         System.out.println(d.a+d.b+d.c+d.d);
//                                 ^
// Test.java:10: error: c has protected access in Demo1
//         System.out.println(d.a+d.b+d.c+d.d);
//                                     ^
// 3 errors