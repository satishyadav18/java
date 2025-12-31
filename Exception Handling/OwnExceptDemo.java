class OwnExcept extends Exception {
    public String toString() {
        return "This is Own Exception";
    }
}

public class OwnExceptDemo {

    // static void fun() throws OwnExcept {
    //     throw new OwnExcept();
    // }

 
    //above code can also be written using try-catch block as shown below
    static void fun() {
        try {
            throw new OwnExcept();
        } catch (OwnExcept e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
       
       // used when exception is not handled using try-catch block inside fun()
        // try {
        //     fun();
        // } catch (OwnExcept e) {
        //     System.out.println(e);
        // }

        fun(); // since we have handled the exception inside fun() using try-catch block, no need to handle it here
    }
}