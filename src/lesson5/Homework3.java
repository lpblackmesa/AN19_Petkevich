package lesson5;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int arr[][] =   {{1, 0, 0, 0},
                         {0, 1, 0, 0},
                         {0, 0, 0, 0}};
        int arr2[][] = {{1, 2, 3},
                        {1, 1, 1},
                        {0, 0, 0},
                        {2, 1, 0}};
        int arr3[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    arr3[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
}

