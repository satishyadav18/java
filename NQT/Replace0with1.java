
// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class Replace0with1{

//     public static int replaced(int num){
        
//         if(num == 0){
//             return 1;
//         }

//         int result = 0;
//         while(num != 0){
//             int r = num % 10;
//             if(r == 0){
//                 result =  (result * 10) + 1; 
//             }else{
//                 result = (result * 10) + r;
//             }
//             num = num / 10;
//         }
//         String s =  Integer.toString(result);
//         StringBuilder sb = new StringBuilder(s);
//         sb.reverse();
//         s = sb.toString();

//         return Integer.parseInt(s);
//     }

//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter the number: ");
//         int n = Integer.parseInt(br.readLine());

//         System.out.println(Replace0with1.replaced(n));
//     }
// }






import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Replace0with1{

    public static int replaced(int n){
        
        String num = Integer.toString(n);

        // Use a StringBuilder to build the modified number
        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (int i = 0; i < num.length(); i++) {
            // If the digit is '0', replace with '1'
            if (num.charAt(i) == '0') {
                result.append('1');
            } else {
                result.append(num.charAt(i));
            }
        }

        // Convert the final string back to integer
        return Integer.parseInt(result.toString());
    
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println(Replace0with1.replaced(n));
    }
}