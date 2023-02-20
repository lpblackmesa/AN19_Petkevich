package lesson3_arrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        int l;
        int count =0, step =0;
        do {
            System.out.println("Please, array lenght ");
            Scanner scanner = new Scanner(System.in);
            l = scanner.nextInt();
            if (l <= 5 | l > 10) {
                System.out.println("Your number is out of range, please write again ");
            }

        } while (l <= 5 | l > 10);
        int arr[] =new int[l];

        for (int i=0; i<arr.length;i++) {
            arr[i] = (int) ( Math.random() * 10 );
            if (arr[i] % 2 !=0) {
                count++;
            }
        }
        System.out.println("Array is generated ");
        System.out.println(Arrays.toString(arr));

            int arr2[] = new int[arr.length-count];
            for (int i=0;i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arr2[step] = arr[i];
                    step++;
                }
            }
                System.out.println("Second Array  ");
            System.out.println(Arrays.toString(arr2));


    }
}
