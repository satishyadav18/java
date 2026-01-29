// Solution class to handle the logic
class Solution {
    // Method to convert binary string to decimal
    public static int binaryToDecimal(String s) {
        int base = 1;
        int ans = 0;

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                ans += base;
            }
            base *= 2;
        }
        return ans;
    }
}

// Main class to test the solution
public class BinToDec {
    public static void main(String[] args) {
        String s = "1011";
       // Solution sol = new Solution();
        //int result = sol.binaryToDecimal(s);
      
        int result = Solution.binaryToDecimal(s);
        System.out.println(result);
    }
}
