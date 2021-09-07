import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int result = 0;
        HashMap<Integer, Integer> arr_sums = new HashMap<>();
        arr_sums.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (arr_sums.containsKey(sum-k))
                result += arr_sums.get(sum-k);

            arr_sums.put(sum, arr_sums.getOrDefault(sum, 0) + 1);
        }


        return result;
    }
}