

import java.util.Scanner;

public class Elif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of a: ");
        // int a = sc.nextInt();

        int a = 8;
 
        if(a>=0){
            System.out.println("Positive number.");
        }
        else{
            System.out.println("Negative number.");
        }

        sc.close();
    }
}
