class Test{
    static{
        System.out.println("static block1");
    }

    static{
        System.out.println("static block2");
    }
}

public class StaticBlock{
    // static{
    //     System.out.println("Main static block1");
    // }

    public static void main(String[] args) {
        
        // Test t = new Test();
        System.out.println("main method");  //main method will be executed after static block

    }

    // static{
    //     System.out.println("Main static block2");
    // }
   
}