package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Please, write number ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int arr[][][] = new int[3][3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int n = 0; n < arr[i][j].length; n++) {
                    arr[i][j][n] = (int) (Math.random() * 10);
                }
                System.out.println(Arrays.toString(arr[i][j]));
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int n = 0; n < arr[i][j].length; n++) {
                    arr[i][j][n] += l;
                }
            }
        }
        System.out.println("New array is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(Arrays.toString(arr[i][j]));
            }
            System.out.println();
        }
    }
}
