package lesson2;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        int i;

        while (true) {
            System.out.println("Please, write temp ");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            if (i == 0) {
                break;
            } else if (i > -5) {
                System.out.println("HOT");
            } else if (i > -20) {
                System.out.println("Medium");
            } else System.out.println("COLD");
        }
    }
}
