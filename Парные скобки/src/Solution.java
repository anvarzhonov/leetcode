import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        if (s.length() < 2) return false;

        Stack<Character> stack = new Stack();
        boolean isValid = true;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            switch (current) {
                case '(':
                case '[':
                case '{':
                    stack.push(current);
                    isValid =false;
                    break;
                case ')':
                case ']':
                case '}':
                    if (!stack.isEmpty()) {
                        char ch = stack.pop();
                        if ((ch == '(' && current != ')') ||
                                (ch == '[' && current != ']') ||
                                (ch == '{' && current != '}')) {
                            return false;
                        }
                    }
            }
        }
        return isValid;
    }

    public static void main(String[] args) {
        String s= "((";
        System.out.println(isValid(s));
    }
}
        
    