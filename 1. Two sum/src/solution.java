import java.util.HashMap;
import java.util.Map;

class solution {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[i];

                if (nums[j] == complement) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public int[] twoSum1 (int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i };
            }
            map.put(nums[i], i );
        }
        throw new IllegalArgumentException();
    }
}