import java.util.Arrays;

public class Solution {
    public static int[] findLongest(int[] arr, int s) {
        int[] result = new int[]{-1};

        int sum = 0;
        int left = 0, right = 0;
        int currentSum = 0;


        for (right = 0; right < arr.length; right++) {
            currentSum += arr[right];

            while (left < right && currentSum > s){
                currentSum -= arr[left];
                left++;
            }

            if (currentSum == s && (result.length == 1 || result[1] - result[0] < right - left)) {
                result = new int[]{left + 1 , right + 1 };
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10};
        int[] result = findLongest(arr, 15);
        System.out.println(Arrays.toString(result));
    }
}
