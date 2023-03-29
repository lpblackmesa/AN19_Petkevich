package lesson10;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        System.out.println("Please, write number of strings ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        String arr[] = new String[l];
        int arrLength[] = new int[l];
        int max = 0, min = 0, maxI = 0, minI = 0;
        for (int i = 0; i < l; i++) {
            System.out.print("Enter " + (i + 1) + " string:");
            arr[i] = scanner.next();
            arrLength[i] = arr[i].length();
            if (i == 0) min = arrLength[i];

            if (max < arrLength[i]) {
                max = arrLength[i];
                maxI = i;
            }
            if (min > arrLength[i]) {
                min = arrLength[i];
                minI = i;
            }
        }
        StringBuilder s = new StringBuilder();
        System.out.println(s.append(arr[minI]).append(" - ").append(arrLength[minI]).append(" / ").append(arr[maxI]).append(" - ").append(arrLength[maxI]));
    }
}

