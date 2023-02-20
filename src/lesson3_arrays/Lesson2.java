package lesson3_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Please, write array length ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int mas[] = new int[l];
        for (int i = 0; i < mas.length; i++) {
            System.out.print("Please, write array value "+ i + ":");
            mas[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(mas));
    }
}
