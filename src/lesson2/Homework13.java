package lesson2;
import java.util.Scanner;
public class Homework13 {
    public static void main(String[] args) {
        int i,j,depo,month;
        float sum;

        System.out.println("Please, write deposit");
        Scanner scanner = new Scanner(System.in);
        depo = scanner.nextInt();
        System.out.println("Please, write month");
        Scanner scanner2 = new Scanner(System.in);
        month = scanner.nextInt();


        for (i=1; i<=month ; i++) {
            depo+=depo*0.07;
        }
        System.out.println("Summ is " + depo);
    }
}
