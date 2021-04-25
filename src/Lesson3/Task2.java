package Lesson3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arrayHundred = new int[100];
        for (int i = 0; i < 100; i++){
            arrayHundred[i] = i +1;
        }
        System.out.println(Arrays.toString(arrayHundred));
    }
}
