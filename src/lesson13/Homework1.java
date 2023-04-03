package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        List<Integer> intArray = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            intArray.add(random.nextInt(20));
            System.out.print(intArray.get(i) + " ");
        }
        System.out.println("\n unique numbers: ");
        intArray.stream().distinct().forEach(a -> System.out.print(a + " "));
        System.out.println("\n filtered 7< <17 and even");
        intArray.stream().filter(a -> a > 7 & a < 18 & a % 2 == 0).forEach(a -> System.out.print(a + " "));
        System.out.println("\n multiply 2");
        intArray.stream().forEach(a -> {
            a = a * 2;
            System.out.print(a + " ");
        });
        System.out.println("\n sorted 4 first numbers");
        intArray.stream().sorted().limit(4).forEach(a -> System.out.print(a + " "));
        System.out.println();
        System.out.println("Stream count - " + intArray.stream().count());
        Optional<Integer> optResult = intArray.stream().reduce((a, b) -> a + b);
        Float result = Float.valueOf(optResult.get()) / intArray.stream().count();
        System.out.println("Stream medium - " + result);
    }
}