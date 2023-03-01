package lesson6;

import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {
        Student arr[] = new Student[14];
        Random random = new Random();
        for (int i = 0; i < 14; i++) {
            arr[i] = new Student(random.nextInt(10));
        }
    }
}
