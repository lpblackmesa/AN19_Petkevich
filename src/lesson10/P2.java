package lesson10;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        System.out.println("Please, write number of strings ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        String arr[] = new String[l];
        int arrLength[] = new int[l];
        StringBuilder s = new StringBuilder();
        int sum = 0, max = 0, min = 0, medium = 0, minI = 0;
        for (int i = 0; i < l; i++) {
            System.out.print("Enter " + (i + 1) + " string:");
            arr[i] = scanner.next();
            arrLength[i] = arr[i].length();
            sum += arrLength[i];
        }
        medium = sum / l;
        for (int i = 0; i < l; i++) {
            if (arrLength[i] >= medium) {
                s.append(arr[i]).append(" - ").append(arrLength[i]).append(" / ");
            }
        }
        System.out.println(s);
    }

}
