class Rev{
    int rever(int n){
        int temp = Math.abs(n); 
        int rem;
        int rev = 0;

        while(temp > 0){
            rem = temp % 10;
            rev = 10 * rev + rem;
            temp = temp / 10;
        }
        return n < 0 ? -rev : rev;
    }
}

public class Reverse{
    public static void main(String[] args){
        Rev r = new Rev();
        int R = r.rever(-6598);
        System.out.println("Reversed number is: "+R);
    }
}