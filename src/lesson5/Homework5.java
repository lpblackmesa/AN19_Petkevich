package lesson5;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Main diagonal");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println("\nSecond diagonal");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[arr.length-i-1][i] + " ");
        }
    }
}
