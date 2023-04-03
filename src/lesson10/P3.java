package lesson10;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        String arr[] = new String[3];
        String arr1[] = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + (i + 1) + " string:");
            arr[i] = scanner.next();
        }
        arr1[0] = arr[0].toLowerCase();
        arr1[2] = arr[2];
        arr1[1] = arr[1].toUpperCase();
        System.out.println(s.append(arr1[2]).append(" / ").append(arr1[1]).append(" / ").append(arr1[0]));
    }
}
