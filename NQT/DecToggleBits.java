
class DecToggleBits {
    public static int toggleBits(int n) {
        String res = "";
        int ans = 0;
        int base = 1;
        while (n > 0) {
            int bit = n % 2;          // get last bit
            res = (bit == 0 ? "1" : "0") + res;  // toggle and prepend
            n = n / 2;
        }
        for(int i = res.length()-1; i > 0 ; i--){
            if(res.charAt(i) == '1'){
                ans += base; 
            }
            base = base * 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(toggleBits(12)); // 12 -> 1100 -> 0011 -> 3
    }
}
