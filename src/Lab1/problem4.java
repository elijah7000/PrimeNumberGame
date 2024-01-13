package Lab1;

public class problem4 {
    public static int romanToInt(String word) {
        int result = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            char currentChar = word.charAt(i);
            int currentValue = IntAndRoman(currentChar);
            if (currentValue < 0) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static int IntAndRoman(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String given = "LVIII";
        int result = romanToInt(given);
        System.out.println(result);
    }
}
