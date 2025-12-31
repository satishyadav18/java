public class ThrowThrowsDemo {
    static int meth1(){
        return 10/0; // this will throw ArithmeticException
    }
    static void meth2(){
        meth1();
    }
    static void meth3(){
        meth2();
    }

    public static void main(String[] args) {

       // meth3(); // exception not handled, will terminate the program   

        // If we want to handle the exception, we can use try-catch block as shown below
        try {
            meth3();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: " + e);
        }

        
    }
}