package lesson3_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Homework6 {
    public static void main(String[] args) {
        System.out.println("Please, array lenght ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        String arr[] = new String[l];
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "str";
        }
        System.out.println("Array is generated ");
        System.out.println(Arrays.toString(arr));

        }
        }

