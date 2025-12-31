// public class ThrowsExc{
//     static int area(int l, int b) throws Exception {
//         if(l<0 || b<0){
//             throw new Exception();
//         }
//         return l*b;
//     }

//     static void meth1() throws Exception{
//         System.out.println("Area is: " + area(-10, 5));
//     }

//     // If we do not handle the exception in main method, we need to declare it using throws keyword as shown below
//     // public static void main(String[] args) throws Exception {
//     //     meth1();
//     // }



//     // The above main method can also be written using try-catch block to handle the exception as shown below
//     public static void main(String[] args) {
//         try {
//             meth1();
//         } catch (Exception e) {
//             System.out.println("Caught in main: " + e);
//         }
//     }
// }





//other way by defining our own exception class
class NegativeDimensionException extends Exception {
    public String toString() {
        return "Negative dimensions are not allowed.";
    }
}

public class ThrowsExc {
    static int area(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0) {
            throw new NegativeDimensionException();
        }
        return l * b;
    }

    static void meth1() throws NegativeDimensionException {
        System.out.println("Area is: " + area(-10, 5));
    }

    public static void main(String[] args) {
        try {
            meth1();
        } catch (NegativeDimensionException e) {
            System.out.println("Caught in main: " + e);
        }
    }
}