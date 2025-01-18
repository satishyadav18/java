public class Test{
    public static void main(String[] args){
        System.out.println("a + b = " + (Integer.parseInt(args[0]) +  Integer.parseInt(args[1])));
        System.out.println("a - b = " + (Integer.parseInt(args[0]) -  Integer.parseInt(args[1])));
        System.out.println("a * b = " + (Integer.parseInt(args[0]) *  Integer.parseInt(args[1])));
        try{
            System.out.println("a / b = " + (Integer.parseInt(args[0]) /  Integer.parseInt(args[1])));
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }
    }
}