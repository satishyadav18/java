
import java.util.*;

public class Max {
    public static void main(String[] args) {
        System.out.print("Enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println("Max number is : " + max);

        System.out.println("......2nd output......");

        int max1 = 0;
        if(a > b){
            max1 = a;
        }
        else{
            max1 = b;
        }
        if(c > max1){
            max1 = c;
        }
        System.out.println("Max is :" + max1);

        //by inbuilt method....
        int max2 = Math.max(c, Math.max(a,b));
        System.out.println(max2);

        sc.close();
    }
}
