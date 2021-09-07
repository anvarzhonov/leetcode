import java.util.HashSet;
import java.util.Set;

/**
 * Вывести первый дубликат в массива
 * a: [2, 1, 3, 5, 3, 2]
 * return 3
 */
public class Solution {
    int furstDublicate(int[] a){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <a.length ; i++) {
            if (set.contains(a[i])){
                return a[i];
            }else
                set.add(a[i]);
        }
        return -1;
    }
}
