package lesson13.homework3;


import java.util.Scanner;

class MyMath {
    public static int sumFactorials(int factorial) {
        int results = 1;
        for (int i = 1; i <= factorial; i++)
            results = results * factorial;
        return results;
    }
}
public class Homework3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число:");
        switch (scanner.nextInt()) {
            case 1 -> {
                MyFuncInterface<String> myFuncInterface = s -> String.valueOf(new StringBuilder(s).reverse());
                System.out.println(myFuncInterface.start("Hello functional interface"));
            }
            case 2 -> {
                MyFuncInterface<Integer> myFuncInterface = MyMath::sumFactorials;
                System.out.println(myFuncInterface.start(5));
            }
        }
    }
}
