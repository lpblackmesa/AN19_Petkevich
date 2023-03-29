package lesson10;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Please, write string ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            newText.append(text.charAt(i)).append(text.charAt(i));
        }
        System.out.println(newText);
    }
}
