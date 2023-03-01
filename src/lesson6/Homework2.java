package lesson6;

import java.util.Scanner;

public class Homework2 {
     public static void main(String[] args) {
        System.out.println("Please, write number ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        Cash cash = new Cash();
       cash.getMoney(l);


    }
}

class Cash2 {
    int cash_20 = 10, cash_50 = 10, cash_100 = 10;
}

