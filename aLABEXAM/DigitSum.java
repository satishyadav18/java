//Write a program to find the sum of digits of a given integer number (i) using static i/p and 

import java.util.Scanner;

public class DigitSum{
    static int calculateSum(int n){
        int sum = 0;
        while(n != 0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        System.out.println("Sum of the digits : " + calculateSum(n));
    }
}