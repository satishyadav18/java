// public class FinalDemo {
//     static final float pi; //it need static block to initialise 
    
//    // final float pi; 
//     //pi = 3.1425f; //can be intialised like it need to be initialise in block

//     static
//     {
//         pi = 3.1425f; //inside block
//     }

//     public static void main(String[] args) {
//         // final float pi = 3.1425f;
//         System.out.println(pi);        
        
//     }
// }



// final variable can be intialised in constructor
// public class FinalDemo {
//     final float pi; //it need constructor to initialise 

//     public FinalDemo()
//     {
//         pi = 3.1425f; //inside constructor
//     }

//     public static void main(String[] args) {
//         FinalDemo obj = new FinalDemo();
//         // final float pi = 3.1425f;
//         System.out.println(obj.pi);        
        
//     }
// }


//final method and final class

//class Test{
    // public final void show() //final method cannot be overridden and it is used to restrict overriding or runtime polymorphism
    // {
    //     System.out.println("Hello");
    // }
// }

// class Demo extends Test{
//     // public void show() //final method cannot be overridden
//     // {
//     //     System.out.println("Hi");
//     // }
//}


// class Test{
//     public void show() //final method cannot be overridden
//     {
//         System.out.println("Hello");
//     }
// }

// class Demo1 extends Test{
//     @Override
//     public void show() 
//     {
//         System.out.println("Hi");
//     }
// }


// public final class FinalDemo extends Test{ //final class cannot be inherited
//     public static void main(String[] args) {
//        // System.out.println("Hello");

//         Demo1 obj = new Demo1();
//         obj.show();
//     }
// }

final class Test{ //final class cannot be inherited
    public void show() 
    {
        System.out.println("Hello");
    }
}  

// class Demo1 extends Test{     // final class cannot be inherited
//     @Override
//     public void show() 
//     {
    
//     }
// }

public class FinalDemo {
    public static void main(String[] args) {
       // System.out.println("Hello");
    }
}