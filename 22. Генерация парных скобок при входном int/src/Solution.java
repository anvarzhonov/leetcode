import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> output_arr = new ArrayList<>();

        backtracking(output_arr, "", 0, 0, n);

        return output_arr;

    }

    public static void backtracking(List<String> output, String current,
                                    int open, int close, int max) {
        // base case
        if (current.length() == max * 2) {
            output.add(current);
            return;
        }

        if (open < max) {
            backtracking(output, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtracking(output, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}