package myjava;

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        System.out.print("Enter fruit name: ");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();


        // switch(fruit){
        //     case "Mango":
        //         System.out.println("King of fruits.");
        //         break;
        //     case "Orange":
        //         System.out.println("Round fruit.");
        //         break;
        //     case "Apple":
        //         System.out.println("A sweet red fruit.");
        //         break;
        //     case "Grapes":
        //         System.out.println("small fruit");
        //         break;
        //     default:
        //         System.out.println("Enter a valid input!!");
                
        // }

        //Enhanced switch statement
        switch(fruit){
            case "Mango" -> System.out.println("King of fruits.");
                
            case "Orange" -> System.out.println("Round fruit.");
                
            case "Apple" -> System.out.println("A sweet red fruit.");
                
            case "Grapes" -> System.out.println("small fruit");
                
            default -> System.out.println("Enter a valid input!!");     
        }

        in.close();
    }
}
