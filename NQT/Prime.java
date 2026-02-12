// class Prime {
//     static boolean isPrime(int n) {
      
//         // Check if n is 1 or 0
//         if (n <= 1)
//             return false;

//         // Check if n is 2 or 3
//         if (n == 2 || n == 3)
//             return true;

//         // Check whether n is divisible by 2 or 3
//         if (n % 2 == 0 || n % 3 == 0)
//             return false;
        
//         // Check from 5 to square root of n
//         // Iterate i by (i+6)
//         for (int i = 5; i * i <= n; i = i + 6)
//             if (n % i == 0 || n % (i + 2) == 0)
//                 return false;

//         return true;
//     }

//     public static void main(String[] args) {
//         int n = 11; 
//       	if(isPrime(n)){
//         	System.out.println("true");
//         }else{
//           System.out.println("false");
//     	}
//     }
// }


// import java.util.Scanner;
import java.io.*;


public class Prime{

    static boolean isPrime(int n){
        if(n <= 1)
            return false;
        if(n==2 || n==3)
            return true;
        if(n % 2 == 0 || n % 3 == 0)
            return false;
        for(int i=5; i*i <= n; i = i+6){
            if(n % i == 0 || n % (i+2) == 0)
                return false;
        
        }
            return true;
        

    }

    public static void main(String[] args) throws Exception{
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the range: ");
        // int n = sc.nextInt();
        int n = Integer.parseInt(br.readLine());

        if(n < 2)
            System.out.println("No prime num within this range.");
    
        for(int i=2; i <=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}