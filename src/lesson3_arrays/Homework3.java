package lesson3_arrays;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int sum = 0, sum2 = 0;
        double med, med2;
        int arr[] = new int[5];
        int arr2[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            arr2[i] = (int) (Math.random() * 10);
            sum += arr[i];
            sum2 += arr2[i];
        }
        System.out.println("Arrays are generated ");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        med = (double)sum / arr.length;
        med2 = (double)sum2 / arr2.length;
        System.out.println("Medium for array 1 : " + med);
        System.out.println("Medium for array 2 : " + med2);
        if (med > med2) {
            System.out.println("Medium  array 1 is bigger ");
        } else if (med < med2) {
            System.out.println("Medium  array 2 is bigger ");
        } else {
            System.out.println("Medium  arrays is the same ");
        }
    }
}
