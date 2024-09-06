//commandline input

public class Sum_Rev {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int temp = num;
        int sum = 0;
        int rev = 0;
        while(temp != 0){
            int rem = temp % 10;
            sum += rem;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        System.out.println("sum of digits is "+sum+", Reverse of the number is "+rev);
    }
}
