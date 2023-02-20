package lesson3_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Please, write array lenght ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int min, max, sum = 0;
        double med;
        int arr[] = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Array is generated ");
        System.out.println(Arrays.toString(arr));
        min = arr[0];
        max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
            if (min > arr[i + 1]) {
                min = arr[i + 1];
            }
            if (max < arr[i + 1]) {
                max = arr[i + 1];
            }
        }
        sum += arr[arr.length - 1];
        med = (double) sum / arr.length;
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
        System.out.println("MEDIUM : " + med);
    }
}
