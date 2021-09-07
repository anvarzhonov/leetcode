
public class Solution2 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int first = findFirstIndex(nums, target);
        if (first == -1) return new int[]{-1, -1};

        int last = findLastIndex(nums, target, first);

        return new int[] {first, last};
    }

    public int findFirstIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    firstIndex = mid;
                }
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return firstIndex;
    }

    public int findLastIndex(int[] nums, int target, int firstIndex) {
        int left = firstIndex ;
        int right = nums.length - 1;
        int lastIndex = firstIndex;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    lastIndex = mid;
                }
                left = mid + 1;
            }
            else {
                right= mid - 1;
            }
        }
        return lastIndex;
    }
}
