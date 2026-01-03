import java.io.*;
import java.util.*;

//file reading 
// public class Resource{
//     static FileInputStream fi;

//     static void Divide() throws FileNotFoundException{
//         fi = new FileInputStream("C:\\Desktop\\ResourceDemo.txt"); //file containt 40 30 0 20 10 

//         Scanner sc = new Scanner(fi);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         //int c = sc.nextInt();
//         System.out.println(a/b); // (40 / 30) = 1
//     }

//     public static void main(String[] args) throws Exception{
//         Divide();
//     }
// }


// 2nd step resource closing and reading
// public class Resource{
//     static FileInputStream fi;
//     static Scanner sc;

//     static void Divide() throws Exception{
//         fi = new FileInputStream("C:\\Desktop\\ResourceDemo.txt"); //file containt 40 30 0 20 10 

//         sc = new Scanner(fi);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         //int c = sc.nextInt();
//         System.out.println(a/b); 

//         fi.close();
//         sc.close();
//     }

//     public static void main(String[] args) throws Exception{
//         Divide();
        
//         int x = sc.nextInt();
//         System.out.println(x);  //gives error because the scanner class has been closed and after closing we are reading.

//         //     Exception in thread "main" java.lang.IllegalStateException: Scanner closed
//         //     at java.base/java.util.Scanner.ensureOpen(Scanner.java:1175)
//         //     at java.base/java.util.Scanner.next(Scanner.java:1598)
//         //     at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
//         //     at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
//         //     at Resource.main(Resource.java:45)
//      }
// }


//3rs step when expection arises then file closing or resouce handling

// public class Resource{
//     static FileInputStream fi;
//     static Scanner sc;

//     static void Divide() throws Exception{
//         fi = new FileInputStream("C:\\Desktop\\ResourceDemo.txt"); //file containt 40 30 0 20 10 

//         sc = new Scanner(fi);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt(); //c = 0
//         System.out.println(a/c);  // error arsises here and after this the two lines for closing will not executes
//                                     // java.lang.ArithmeticException: / by zero


//         fi.close();       // not exectued so resources are not closed 
//         sc.close();        // ans the the reoursce and be accessed in main (value of x).
//     }

//     public static void main(String[] args) throws Exception{
//         try {
//           Divide();    
//         } catch (Exception e) {
//             System.out.println(e);
//         }
        
//         int x = sc.nextInt();
//         System.out.println(x);   //20 as the error lead the program to skip the closing statement thus resource is still acquired by the program and hence we are able to access it
//      }
// }

// // C:\codes\JAVA\Exception Handling\Try with resources>javac Resource.java

// // C:\codes\JAVA\Exception Handling\Try with resources>java Resource
// // java.lang.ArithmeticException: / by zero
// // 20



//4th step : to solve the above problem that to prevent access like that we cam use finally block

// public class Resource{
//     static FileInputStream fi;
//     static Scanner sc;

//     static void Divide() throws Exception{
//         fi = new FileInputStream("C:\\Desktop\\ResourceDemo.txt"); //file containt 40 30 0 20 10 
//         try {
//             sc = new Scanner(fi);
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int c = sc.nextInt(); //c = 0
//             System.out.println(a/c);  // error arsises here and after this for execution of closing lines we wrap them in finally block
//                                         // java.lang.ArithmeticException: / by zero
//         }
//         finally{
//             fi.close();       
//             sc.close();        
//         }
//     }

//     public static void main(String[] args) throws Exception{
//         try {
//           Divide();    
//         } catch (Exception e) {
//             System.out.println(e);
//         }
        
//         int x = sc.nextInt();
//         System.out.println(x);   //error below
//      }
// }

// :\codes\JAVA\Exception Handling\Try with resources>java Resource
// java.lang.ArithmeticException: / by zero
// Exception in thread "main" java.lang.IllegalStateException: Scanner closed
//         at java.base/java.util.Scanner.ensureOpen(Scanner.java:1175)
//         at java.base/java.util.Scanner.next(Scanner.java:1598)
//         at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
//         at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
//         at Resource.main(Resource.java:128)




//Try with resources 

public class Resource{
   

    static void Divide() throws Exception{
         //file containt 40 30 0 20 10 
        try(FileInputStream fi = new FileInputStream("C:\\Desktop\\ResourceDemo.txt"); Scanner sc = new Scanner(fi)) {
            int a = sc.nextInt();        // try handles the resources closing we donot need finally block here.
            int b = sc.nextInt();
            int c = sc.nextInt(); //c = 0
            System.out.println(a/c);  // error arsises here 
            System.out.println(b);
        }
    }

    public static void main(String[] args) throws Exception{
        try {
          Divide();    
        } catch (Exception e) {
            System.out.println(e);
        }
        
      //  int x = sc.nextInt();
      //  System.out.println(x);   
     }
}

// C:\codes\JAVA\Exception Handling\Try with resources>java Resource
// java.lang.ArithmeticException: / by zero