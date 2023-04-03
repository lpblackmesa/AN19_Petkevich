package lesson10;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Please, write string ");
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        String maxStr = "", minStr = str[0];

        for (String str1 : str) {
            if (minStr.length() >= str1.length()) {
                minStr = str1;
            }
            if (maxStr.length() <= str1.length()) {
                maxStr = str1;
            }
        }
        System.out.println("min string :" + minStr);
        System.out.println("max string :" + maxStr);
    }
}
