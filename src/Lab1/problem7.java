package Lab1;

import java.util.Arrays;

public class problem7 {
    public static int[] addNum(int[] originalArray, int value) {

        int[] newArray = Arrays.copyOf(originalArray, originalArray.length);
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int lastD = digits[digits.length - 1] + 1;

        digits = addNum(digits, lastD);

        System.out.println(Arrays.toString(digits));
    }
}