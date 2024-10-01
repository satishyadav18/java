import java.util.Scanner;

public class MenudrivenOp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("======");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter two numbers: ");

        int x = in.nextInt();
        int y = in.nextInt();
        in.nextLine();

        System.out.println("Enter the operation: ");
        String operation = in.nextLine();

        switch(operation){
            case "ADD": System.out.println("Addition: "+(x+y));
                break;
            case "SUB": System.out.println("Subtraction: "+(x-y));
                break;
            case "MUL": System.out.println("Multiply: "+(x*y));
                break;
            case "DIV": System.out.println("Division: "+(x/y));
                break;
            default: System.out.println("invalid input");
                break;
        }

        in.close();
    }
}
