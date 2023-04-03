package lesson11;


import java.util.*;

public class Homework2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.next();
        if (checkBuckets(str)) {
            System.out.println("Good buckets!");
        } else System.out.println("Wrong buckets!");
    }
    public static boolean checkBuckets(String str) {
        Map<String, String> brackets = new HashMap<>();
        brackets.put("(", ")");
        brackets.put("[", "]");
        brackets.put("{", "}");
        brackets.put("<", ">");
        Deque<String> buffer = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            String symbol = String.valueOf(str.charAt(i));
            if (brackets.containsKey(symbol)) {
                buffer.offer(symbol);
            } else if (brackets.containsValue(symbol)) {
                if (!buffer.isEmpty()) {
                    if (!brackets.get(buffer.pollLast()).equals(symbol)) {
                        return false;
                    }
                } else return false;
            }
        }
        return buffer.isEmpty();
    }
}
