import java.util.*;

class Prime{
    boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        else{
            for(int i=2; i<=n/2; i++){
                if(n%i == 0){
                    return true;
                }
            }
            return false;
        }
    }
}


public class IfPrime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        Prime t = new Prime();
        boolean b = t.isPrime(n);
        
        if(b){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }

    }
}