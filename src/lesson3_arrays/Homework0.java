package lesson3_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework0 {
    public static void main(String[] args) {
        System.out.println("Please, write number ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        boolean q = false;
        Random random = new Random();
        int mas[] = new int[6];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
            if (mas[i] == l) {
                q = true;
            }
        }
        System.out.println(Arrays.toString(mas));
        if (q) {
            System.out.print("Число есть в массиве");
        } else {
            System.out.print("Числа нет в массиве");
        }

    }
}

