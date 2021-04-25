package Lesson3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] twoArrays = new int[5][5];
        int number = twoArrays.length - 1;
        for (int i = 0; i < twoArrays.length; i++) {
            twoArrays[i][i] = twoArrays[i][number - i] = 1;
            System.out.println(Arrays.toString(twoArrays[i]));
        }

    }
}
