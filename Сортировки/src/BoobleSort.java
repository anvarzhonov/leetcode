

public class BoobleSort {


    public static void main(String[] args) {
        int[] arr =new int[] {10,2,6,1,3,4,5,67,9};
        sort_Insert(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort_Insert(int[] arr){

        for (int i = 0; i< arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int min= i;
                if (arr[j] <arr[min]){
                    int temp = arr[j];
                    arr[j]= arr[min];
                    arr[min]= temp;
                }
            }
        }
    }
}
