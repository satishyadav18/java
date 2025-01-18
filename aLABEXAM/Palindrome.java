import java.util.*;

public class Palindrome{
    static void checkPalin(int n){
        int num = n;
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if(rev == num){
            System.out.println("Palindrome...");
        }
        else{
            System.out.println("NOt Palindrome..");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        checkPalin(n);
    }
}