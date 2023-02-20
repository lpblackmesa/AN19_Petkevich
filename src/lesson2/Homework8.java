package lesson2;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        System.out.println("Please, write number");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= j; i++) {
            sum += i;
        }
        System.out.println("Summ is " + sum);
    }
}
