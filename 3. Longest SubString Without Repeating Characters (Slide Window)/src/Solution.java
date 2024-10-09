import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while (b_pointer < s.length()) {
            if (!set.contains(s.charAt(b_pointer))) {
                set.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(max, b_pointer - a_pointer);
            } else {
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }

        }
        return max;
    }

    // O(n^2)
    public int longestkSubstr(String s) {
        int maxResult = 0;

        for (int i=0;i<s.length();i++) {
            int substringResult = 0;
            char currentValue = s.charAt(i);
            for (int j=i++;j<s.length();j++) {
                if (currentValue == s.charAt(j)) {
                    maxResult = Math.max(maxResult, substringResult);
                } else {
                    substringResult++;
                }
            }
        }

        return maxResult;
    }
//        int maxCount = 0;
//        int i = 0, j = 0;
//        int strLen = s.length();
//
//        Set<Character> st = new HashSet<>();
//
//        while (i < strLen && j < strLen) {
//            if (!st.contains(s.charAt(j))) {
//                st.add(s.charAt(j));
//                j++;
//                maxCount = Math.max(maxCount, j - i);
//
//            } else {
//                st.remove(s.charAt(i));
//                i++;
//            }
//        }
//        return maxCount;


    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}