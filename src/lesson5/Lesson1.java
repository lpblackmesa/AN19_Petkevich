package lesson5;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        int sum = 0;
        int arr[][] = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                if (sum < arr[i][j]) {
                    sum = arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Max number is " + sum);
    }
}
