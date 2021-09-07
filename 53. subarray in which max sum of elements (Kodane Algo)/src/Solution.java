
public class Solution {
    // Native
    public static int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int curSum = 0;
            for (int j = i; j < nums.length; j++) {
                curSum += nums[j];
                maxSum = Math.max(maxSum, curSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, - 5, 4};
        System.out.println(maxSubArray(arr));
    }
}
