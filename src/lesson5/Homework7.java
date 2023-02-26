package lesson5;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        int clc = 0;
        int arr[][] = new int[5][5];
        int[] tempArray = new int[arr.length * arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                tempArray[clc++] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        Arrays.sort(tempArray);
        clc = 0;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = tempArray[clc++];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
