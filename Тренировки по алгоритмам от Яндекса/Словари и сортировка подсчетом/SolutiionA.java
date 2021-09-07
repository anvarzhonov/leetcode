import java.util.HashMap;
import java.util.Map;

/**
 * Вам дан словарь, состоящий из пар слов.
 * Каждое слово является синонимом к парному ему слову. Все слова в словаре различны.
 * Для одного данного слова определите его синоним.
 * -----------------------------
 * Формат ввода
 * Программа получает на вход количество пар синонимов N.
 * Далее следует N строк, каждая строка содержит ровно два слова-синонима. После этого следует одно слово.
 * ---------------
 * Ввод:
 * 3
 * Hello Hi
 * Bye Goodbye
 * List Array
 * Goodbye
 * ---- Вывод: Bye;
 */

public class SolutiionA {
    public static String dictionary(int n, String[] word){
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n*2 ; i++) {
            if (i % 2 !=0){
                map.put(word[i],word[i-1]);
            }
        }
        if (map.containsKey(word[word.length-1])){
            return map.get(word[word.length-1]);
        }
        return "not found";
    }

    public static void main(String[] args) {
        int n= 3;
        String[] words = {"Hello", "Hi", "By", "GoodBye","List","Array","Goodbye"};
        System.out.println(dictionary(3,words));
    }
}
