
import java.io.IOException;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer arr[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> list = Arrays.asList(arr);

        for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(list.get(i+1)))
                    list.remove(i);
        }
        for(Integer temp :list){
            System.out.println(temp);
        }

    }
}
