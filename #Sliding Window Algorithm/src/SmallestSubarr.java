/**
 * Найдите наименьшую длину подмассива в котором сумма значений будет больше или равно K
 */


public class SmallestSubarr {
    public static int smallestSub(int[] arr, int target) {

        int currentSum = 0;
        int minWindowSize = Integer.MAX_VALUE;
        int windowStart = 0, windowEnd = 0;

        for (windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentSum += arr[windowEnd];

            while (currentSum >= target) {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart +1 );
                if (minWindowSize == 1) return minWindowSize; // так как у нас минимальное окно должно быть 1,
                // то если такой случай попадет, не имеет смысла проверять дальше

                currentSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minWindowSize;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1 ,2, 4 ,3};
        System.out.println(smallestSub(arr, 7));
    }
}
