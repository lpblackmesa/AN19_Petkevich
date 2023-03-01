package lesson6;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Please, write number ");
        Scanner scanner = new Scanner(System.in);
        if (cat.feed(scanner.nextInt())) {
            System.out.println("Cat is happy");
        } else {
            System.out.println("Cat is unhappy");
        }
    }
}
