import javax.swing.*;

/**
 * Префиксная сумма
 */

// Cколько нулей на полуинтервале [ L,R )
public class Sol {


    public static void main(String[] args) {
        int[] arr = {1, 4, -4, 6, 3, -6};

        System.out.println(sums(arr));
    }



    // Посчитали сумму чисел в отрезке от left до right не включительно
    public static int prefixSum(int[] arr, int left, int right){
        int[] prefixSumArr= new int[arr.length+1];
        prefixSumArr[0]=0;
        for (int i = 1; i <arr.length ; i++) {
            prefixSumArr[i] = prefixSumArr[i-1] + arr[i-1];
        }

        int result = prefixSumArr[right]- prefixSumArr[left];
        return result;
    }

    // Решение задачи за O(n^3) - Небоходимо найти количество отрезков и с нулевой суммой.
    public static int sums(int[] arr) {
        int sumcount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length+1; j++) {
                int result = 0;
                for (int k = i; k < j; k++) {
                    result += arr[k];
                    if (result == 0) sumcount++;
                }
            }
        }
        return sumcount;
    }

}
