/**
 * Даны два числа X и Y. Необходимо проверить можно ли получить первого из второго перестановкой цифр.
 * В данной задаче нам не обязательно переставлять цифры во втором числе и проверять равно ли это число первому.
 * Достаточно проверить что количество одинаковых цифр в первом числе совпадает со вторым.
 * <p>
 * Используем для этого сортировку подсчетом
 */

public class Solution1 {
    public static boolean twoNumbers(int x, int y) {
        int[] arrFirstNum = new int[10];
        int[] arrSecondNum = new int[10];

        while (x > 0) {
            int lastDigit = x % 10;
            arrFirstNum[lastDigit]++;
            x /= 10;
        }
        while (y > 0) {
            int lastDigit = y % 10;
            arrSecondNum[lastDigit]++;
            y /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (arrFirstNum[i] != arrSecondNum[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(twoNumbers(2133332, 3333122));
    }
}
