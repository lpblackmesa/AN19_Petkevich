package lesson10;

import java.util.HashSet;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Please, write string ");
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        HashSet<String> chars = new HashSet<String>();
        int minChar = Integer.MAX_VALUE, minI = 0;
        for (int i = 0; i < str.length; i++) {
            chars.clear();
            for (int j = 0; j < str[i].length(); j++) {
                chars.add(String.valueOf(str[i].charAt(j)));
            }
            if (minChar > chars.size()) {
                minChar = chars.size();
                minI = i;
            }
        }
        System.out.println(str[minI]);
    }
}
