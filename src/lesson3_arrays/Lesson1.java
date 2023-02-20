package lesson3_arrays;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int max = mas[0], min = mas[0];
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length - 1; i++) {
            if (max < mas[i + 1]) {
                max = mas[i + 1];
            }
            if (min > mas[i + 1]) {
                min = mas[i + 1];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
