
public class Table{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);

        System.out.println("Table of "+num+" is: ");
        for(int i=1; i<=10; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }

    }
}
     
     
     
     
     // Practise sum_reb of a number using cmnd line input

        // int n = Integer.parseInt(args[0]);
        // int sum = 0;
        // int rev = 0;
        // while(n > 0){
        //     int rem = n % 10;
        //     n = n / 10;
        //     rev = rev * 10 + rem;
        //     sum += rem;
        // }
        // System.out.println("rev: "+rev);
        // System.out.println("sum: "+sum);