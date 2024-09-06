
import java.util.*;

public class CountNum {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Enter the number to be counted: ");
        int digit = sc.nextInt();

        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem == digit){
                count ++;
            }
            num /= 10;
        }
        System.out.println(digit + " is present " + count + " times.");

        sc.close();
    }
}
