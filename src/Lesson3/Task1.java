package Lesson3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] zeroAndOne = {0, 1, 0, 0, 1, 1};
        for (int i = 0; i < zeroAndOne.length; i++){
            if (zeroAndOne[i] == 1){
                zeroAndOne[i] = 0;
            }
            else {
                zeroAndOne[i] = 1;
            }
        }
        System.out.println(Arrays.toString(zeroAndOne));
    }
}
