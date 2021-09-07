
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int current=0;
        int bestLength=0;
        for (int i = 0; i < n ; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            if (arr[i]==1){
                current++;
                bestLength= Math.max(current,bestLength);
            }
            else{
                current = 0;
            }
        }
        System.out.println(bestLength);
    }


}
