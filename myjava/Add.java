package myjava;

import java.util.*;
public class Add {
    public static void main(String[] args) {
        System.out.print("Enter the numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int res = a+b;
        System.out.println(res);
        
        input.close();
    }
}
