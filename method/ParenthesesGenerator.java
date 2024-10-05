import java.util.ArrayList;
import java.util.List;

public class ParenthesesGenerator {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // If the current string has reached the maximum length, add it to the result
        if (current.length() == 2 * max) {
            result.add(current);
            return;
        }

        // If the number of open parentheses is less than max, add an open parenthesis
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // If the number of close parentheses is less than open, add a close parenthesis
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        ParenthesesGenerator pg = new ParenthesesGenerator();
        int n = 3;
        List<String> combinations = pg.generateParenthesis(n);
        System.out.println(combinations);
    }
}
