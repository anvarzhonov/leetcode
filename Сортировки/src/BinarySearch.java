import java.util.Stack;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr= { 2, 3, 4, 10, 40};
        int size= arr.length;
        int key = 10;
        int result1= binarySearch(arr,key);
        int result = binarySearch_2(arr,0, size-1,key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index" + result);
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int middle;

        while (left <= right) {
            middle = left + (right - left) / 2;

            if (arr[middle] == key) return middle; // середина - есть ключ

            if (key > arr[middle]) {
                left = middle+1;
            } else
                right= middle-1;
        }
        return -1; // If we reach here, then elements was not present
    }

    // Recursion
    public static int binarySearch_2(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch_2(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch_2(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }



}
