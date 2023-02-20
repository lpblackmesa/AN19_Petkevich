package lesson3_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Please, write number ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int count =0;
        int step =0;
        Random random = new Random();
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
            if (mas[i] == l) {
                count++;
            }
        }
        System.out.println("Array is generated ");
        System.out.println(Arrays.toString(mas));
        if (count > 0) {
            System.out.println("Число есть в массиве, повторяется " + count + " раз");
            int mas2[] = new int[10 - count];
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] != l) {
                    mas2[step] = mas[i];
                    step++;
                }
            }
            System.out.println(Arrays.toString(mas2));
        } else {
                System.out.println("Числа в массиве нет");
                int mas2[] = new int[10];
                System.arraycopy(mas,0,mas2,0,10);
                System.out.println(Arrays.toString(mas2));
            }



    }
}
