package lesson5;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        int sum = 0;
        int arr[][] = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length - 1 - i];
        }
        System.out.println("Max number is " + sum);
    }
}
