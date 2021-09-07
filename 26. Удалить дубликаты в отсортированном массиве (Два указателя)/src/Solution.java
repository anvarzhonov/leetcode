/**
 * Данный массив является отсортированным массивом, поэтому повторяющиеся числа будут сгруппированы вместе.
 * Во-первых, мы можем обработать крайний случай пустого массива. Затем мы можем начать итерацию элементов с головы.
 * Второй указатель пройдет по всем элементам в списке, а первый указатель переместится только при встрече с уникальным номером.
 */


class Solution {
    public int removeDuplicates(int[] nums) {
        int slowPtr = 0;
        for (int fastPtr=1; fastPtr < nums.length; fastPtr++){
            if (nums[slowPtr] != nums[fastPtr]){
                nums[++slowPtr] = nums[fastPtr];
            }
        }
        return slowPtr+1;

    }
}