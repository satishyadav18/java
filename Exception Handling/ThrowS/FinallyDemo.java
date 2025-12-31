public class FinallyDemo {
    // static void fun(){
    //     try {
    //         System.out.println("Inside try block");
    //         int data = 25/0; // this will throw ArithmeticException
    //         System.out.println(data);
    //     } catch (ArithmeticException e) {
    //         System.out.println("Caught in catch block: " + e);
    //     } finally {    // for closing resources like database connections, file handling etc.
    //         System.out.println("Inside finally block");
    //     }
    // }

    // public static void main(String[] args) {
    //     fun();
    // }

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int data = 25/0; // this will throw ArithmeticException
            System.out.println(data);
        } catch (ArithmeticException e) {    //If we catch all the exxceptions then finally block is not needed to be used to excecute the last block of code
            System.out.println("Caught in catch block: " + e);
        } finally {
            System.out.println("Inside finally block");
        }
    }

}