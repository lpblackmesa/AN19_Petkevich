package lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Please, write string ");
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        System.out.println("Please, write number of word ");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("It is not a Number");
            System.exit(0);
        }
        if (number > text.length) {
            System.out.println("Number is more than words");
        } else if ((text[number - 1].length() % 2) != 0) {
            String text2 = text[number - 1].substring((text[number - 1].length() / 2) + 1);
            StringBuilder textReverse = new StringBuilder(text[number - 1].substring(0, (text[number - 1].length() / 2)));
            if (text2.equalsIgnoreCase(textReverse.reverse().toString())) {
                System.out.println("Palindrome ");
            } else System.out.println("NOT Palindrome ");
        } else System.out.println("NOT Palindrome ");
    }
}