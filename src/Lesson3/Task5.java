package Lesson3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int len = 5;
        int inithialValue = 55;
        int[] array = initArray(len, inithialValue);
        System.out.println(Arrays.toString(array));
    }

    private static int[] initArray(int len, int inithialValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = inithialValue;
        }
        return array;
    }
}
