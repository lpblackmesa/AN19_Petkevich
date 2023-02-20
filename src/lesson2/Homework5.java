package lesson2;
import java.util.Scanner;
public class Homework5 {
    public static void main(String[] args) {

        int i;
        System.out.println("Please, write number");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();

        if (i == 1) {
            System.out.println("Красный");
        } else if (i == 2) {
            System.out.println("оранжевый");
        } else if (i == 3) {
            System.out.println("жёлтый");
        } else if (i == 4) {
            System.out.println("зеленый");
        } else if (i == 5) {
            System.out.println("голубой");
        } else if (i == 6) {
            System.out.println("синий");
        } else if (i == 7) {
            System.out.println("фиолетовый ");
        } else {
            System.out.println("ERROR!!!");
        }
    }
}
