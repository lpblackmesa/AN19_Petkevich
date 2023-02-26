package lesson5;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        int sum = 0;
        int arr[][] = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                sum += arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Summ is " + sum);
    }
}
