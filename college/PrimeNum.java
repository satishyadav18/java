
import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n < 2){
            System.out.println("No prime num within this range.");
        }        
        else{
            System.out.println("prime number within given range: ");
            for(int i = 2; i <= n; i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
            }
        }
    }    
//     public static boolean isPrime(int num) {
//         if(num <= 1){
//         return false;
//         }
//         else{
//         for(int i = 2; i <= Math.sqrt(num); i++){
//             if(num % i == 0){
//                 return false;
//             } 
//         }
//         return true;
//         }
//     }
    public static boolean isPrime(int n) {
      
        // Check if n is 1 or 0
        if (n <= 1)
            return false;

        // Check if n is 2 or 3
        if (n == 2 || n == 3)
            return true;

        // Check whether n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        
        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }




}
 
// import java.util.*;

// class prime{
//     static boolean isPrime(int num) {
//         if(num <= 1){
//         return false;
//         }
//         else{
//         for(int i = 2; i <= Math.sqrt(num); i++){
//             if(num % i == 0){
//                 return false;
//             } 
//         }
//         return true;
//         }
//     }
// }


// public class PrimeNum {
//     public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//         System.out.print("Enter the lower limit of range: ");
//         int s = in.nextInt();
//         System.out.print("Enter the upper limit of range: ");
//         int n = in.nextInt();
//         // prime p = new prime();
//         // boolean x = p.isPrime(n);
//         if(n < 2){
//             System.out.println("No prime number within this range.");
//         }        
//         else{
//             System.out.print("Prime number within "+s+" and "+n+" are: ");
//             for(int i = s; i <= n; i++){
//                 if(prime.isPrime(i)){
//                     System.out.print(i+" ");
//                 }
//             }
//         }
//         in.close();
//     } 
// }


// import java.io.Console;

// class PrimeHelper {
//   boolean primeFind (int n, int i, int k) {

//     if (i == n) {
//       if (k == 1) return true;
//       else return false;
//     }

//     if (n % i == 0) return primeFind(n, i+1, k+1);
//     else return primeFind(n, i+1, k);
//   }
// }

// class PrimeNum {
//   public static void main(String[] args) {

//         Console c = System.console();
//         int n = Integer.parseInt(c.readLine("Enter number: "));

//         PrimeHelper p = new PrimeHelper();
//         boolean res = p.primeFind(n, 1, 0);
//         System.out.println(res ? "Is Prime" : "Is Not Prime");
//     }
// }