import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();
//        List<List<Integer>> output_arr = new LinkedList<>();

        int sum=0;
        for (int i = 0; i < nums.length-2 ; i++) {
            int left= i+1;
            int right= nums.length-1;

            while(left<right){
                sum = nums[i]+nums[left]+nums[right];

                if (sum==0){
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if (sum>0) right--;
                else if (sum<0) left++;
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

    }
}