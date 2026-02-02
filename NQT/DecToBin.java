public class DecToBin{
    static String toBinary(int n){
        String ans = "";

        while(n > 0){
            int bits = n % 2;
            ans = (bits == 0 ? "0" : "1") + ans;
            n /= 2;
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println(toBinary(n));
    }
}