import java.util.*;
class Rev{
    int isRev(int num){
        int rev = 0;
        
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}


class Palindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        Rev r = new Rev();
        int revNum = r.isRev(num);

        if(num == revNum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }

}