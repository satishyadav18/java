import java.util.*;

public class Mask{
    public static void main(String[] args) {
        System.out.println("Enter a positive integer:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ma = 0;
        if(n < 1 || n > 100){
            System.out.println("Wrong Input");
        }
        for(int i = 0; Math.pow(2, i) <= n; i++){
            ma = (int) (Math.pow(2, i+1) - 1);
           // System.out.println(ma);
        }

        int result = n ^ ma;
        System.out.println("Result after XOR with mask: " + result);
        sc.close();

    }
}