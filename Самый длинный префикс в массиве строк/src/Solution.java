import java.util.Arrays;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for(int i=1; i< strs.length; i++){
            while (strs[i].indexOf(prefix) !=0 ){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;

    }

    public static void main(String[] args) {
        String[] strs= {
                "fllff",
                "flsfls",
                "kfskfks"
        };
        longestCommonPrefix(new String[]{"flower","flow","flight"});
    }
}
/**
 * 1) Задали префиксу первый элемент массива строк
 * 2) Нужно было пройтись по всем элементам массива строк, начиная с первого.
 *  2.1) Пока у нас в текущем элементе массива индекс первого взождения не будет равен нулю
 *      2.1.1) Выполняем съедание по одной букве в строке prefix.
 *      То есть если было flower - то постепенно будет становиться flowe, flow, flo,... и тд ДО ТОГО МОМЕНТА
 *      пока Префикс не станет содержать именно ту часть строки, которая есть и в строке "Prefix" и в текущей.
 *3) Возвращаем готовый prefix.
 */