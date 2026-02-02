// Solution class to handle the logic
class Solution {
    public static String  DecimalToOctal(int n) {
        if(n == 0) return "0";

        StringBuilder ans = new StringBuilder();
        int j = n;

        // Traverse from right to left
        while(j > 0){
            int rem = j % 8;
            ans.insert(0, rem);

            j /= 8;
        }
        return ans.toString();
    }
}

// Main class to test the solution
public class DecToOct {
    public static void main(String[] args) {
        int n = 17;
       // Solution sol = new Solution();
        //int result = sol.binaryToDecimal(s);
      
        String result = Solution.DecimalToOctal(n);
        System.out.println(result);
    }
}
