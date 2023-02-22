package lesson2;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int i;

        while (true) {
            System.out.println("Please, write number ");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            if (i == 0) {
                break;
            } else if (i % 2 == 0) {
                System.out.println("Число чётное");
            } else System.out.println("Число нечётное");
        }
    }
}
