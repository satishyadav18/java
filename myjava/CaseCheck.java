
import java.util.*;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.print("Enter the char or string: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().trim().charAt(0);

       // System.out.println(ch);

       if(ch >= 'a' && ch <= 'z'){
        System.out.println("lower case");
       }
       else{
        System.out.println("upper case");
       }

       sc.close();
    }
}