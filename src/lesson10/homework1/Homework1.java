package lesson10.homework1;


import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        do {
            System.out.println("enter string xxxx-yyy-xxxx-yyy-xyxy, х - Number, y - char");
            text = scanner.nextLine();
        } while (!StringEdit.stringCheck(text));
        StringEdit.show2Block(text);
        StringEdit.showReplacedChars(text);
        StringEdit.showOnlyLowerChars(text);
        StringEdit.showOnlyUpperChars(text);
        StringEdit.showABCmathes(text);
        StringEdit.showStartWith555(text);
        StringEdit.showEndWith1a2b(text);
    }
}

