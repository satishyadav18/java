
import java.io.*;

public class Excep{
    static void fun1() throws FileNotFoundException {  // throws keyword used to declare the exception
        
        // unchecked exception does not require try-catch or throws declaration occurs at runtime only 
        // try {
        //     System.out.println(10 / 0);
        // }
        // catch(Exception e){
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }


        // for this checked exception we have to either handle it using try-catch or declare it using throws keyword
        FileInputStream fi = new FileInputStream("abc.txt");

    }

    // static void fun2(){   for unchecked exception 
    //     fun1();
    // }

    static void fun2() throws FileNotFoundException{ // throws keyword used to declare the exception only in checked exceptions
        fun1();
    }

    static void fun3() throws FileNotFoundException{
        fun2();
    }

      public static void main(String[] args) throws FileNotFoundException {
        fun3();
    }
}