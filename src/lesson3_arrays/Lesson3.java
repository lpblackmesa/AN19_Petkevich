package lesson3_arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Please, write array length ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int l = scanner.nextInt();
        int mas[] = new int[l];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(mas));
    }
}
