package lesson7.homework2;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter patient's name: ");
        Patient patient = new Patient(scanner.next());
        patient.start();
        patient.getInfo();
    }
}
