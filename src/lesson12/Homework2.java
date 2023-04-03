package lesson12;

import java.util.*;

public class Homework2 {
    public static void main(String[] args) {
        List<Integer> intArray = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            intArray.add(random.nextInt(10));
            System.out.print(intArray.get(i) + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write summ");
        int summ = scanner.nextInt();
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < intArray.size(); i++) {
            for (int j = 0; j < intArray.size(); j++) {
                if (intArray.get(i) + intArray.get(j) == summ) {
                    if (i == j) continue;
                    numbers.put(intArray.get(i), i);
                    numbers.put(intArray.get(j), j);
                    System.out.print("Number " + intArray.get(i) + " [" + i + "] ");
                    System.out.println("Number " + intArray.get(j) + " [" + j + "]");
                }
            }
        }

    }

}
