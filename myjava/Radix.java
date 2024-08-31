package myjava;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        String num; 

        System.out.println("Enter the number: ");
        num = in.nextLine();
        
        if(num.matches("[01]+")){
            System.out.println("Binary number format = 01");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Octal number format = 0-7");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("Decimal number format = 0-9");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal number format = 16");
        }
        else{
            System.out.println("Invalid input!!!");
        }

        in.close();
    }
}
