

//class RomanToInt {
//    public static int romanToInt(String s) {
//        int result=0,num = 0;
//        for(int i= s.length()-1; i>=0; i--){
//            switch (s.charAt(i)){
//                case 'I': num= 1; break;
//                case 'V': num = 5; break;
//                case 'X': num = 10; break;
//                case 'L': num = 50; break;
//                case 'C': num = 100; break;
//                case 'D': num = 500; break;
//                case 'M': num = 1000; break;
//            }
//            if (num > result)
//            if (4* num < result ) result-= num;
//            else result+=num;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(romanToInt("III"));
//    }
//}

/*=====================================================================*/
// Solution 2 with HashMap

import java.util.HashMap;
import java.util.Map;

class RomanToInt {
    public static int romantoInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1)); // взяли последний элемент в result
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < result) result -= map.get(s.charAt(i+1));
                // если текущий элемент меньше нашего последнего значения,
                // то есть случай - 'IV' - получается 1<5, значит делаем 5-1 чтобы получить 4.
            else result += map.get(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romantoInt("III"));


    }
}