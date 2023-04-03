package lesson12;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
        List<Integer> intArray = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            intArray.add(random.nextInt(10));
            System.out.print(intArray.get(i) + " ");
        }
        System.out.println();
        Map<Integer, Integer> base = new HashMap<>();
        for (int i = 0; i < intArray.size(); i++) {
            if (!base.containsKey(intArray.get(i))) {
                base.put(intArray.get(i), 1);
            } else {
                base.put(intArray.get(i), base.get(intArray.get(i)) + 1);
            }
        }
        System.out.println(base);
    }
}
