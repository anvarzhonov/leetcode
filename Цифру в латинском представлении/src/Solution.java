
class Solution {
    Numeral[] numerals= {
            new Numeral("M", 1000),
            new Numeral("CM", 900),
            new Numeral("D", 500),
            new Numeral("CD", 400),
            new Numeral("C", 100),
            new Numeral("XC", 90),
            new Numeral("L", 50),
            new Numeral("XL", 40),
            new Numeral("X", 10),
            new Numeral("IX", 9),
            new Numeral("V", 5),
            new Numeral("IV", 4),
            new Numeral("I", 1),
    };
    public String intToRoman(int num) {
        String result = "";
        for (Numeral numeral: numerals){
            /** взяли очередное число и узнали сколько раз надо написать букву,
                у которого наминал - numeral.value
               */
            int numberOfSymbols = num / numeral.value; // 2944 / 1000 = 2 - cтолько раз
            if (numberOfSymbols > 0)
                result += numeral.key.repeat(numberOfSymbols);

            // 2) Удаляем старшую цифру из числа соответсвующую нашей букве (2944 % 1000 = 944)
            num = num % numeral.value;
        }
        return result;
    }

    class Numeral{
        String key;
        int value;

        Numeral(String key, int value){
            this.key= key;
            this.value=value;
        }
    }

}