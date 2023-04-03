package lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        Map<String, Integer> base = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String chr = String.valueOf(str.charAt(i));
            if (!base.containsKey(chr)) {
                base.put(chr, 1);
            } else {
                int temp = base.get(chr);
                base.put(chr, temp + 1);
            }
        }
        System.out.println(base);
    }
}
