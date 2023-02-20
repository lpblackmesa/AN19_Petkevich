package lesson3_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Please, array lenght ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int arr[] = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Array is generated ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i+=2) {

                arr[i] = 0;

        }
        System.out.println("Modyfied Array");
        System.out.println(Arrays.toString(arr));
    }
}
