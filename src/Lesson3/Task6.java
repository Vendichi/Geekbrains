package Lesson3;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {2, 7, 15, 1, 6, 9, 5};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
