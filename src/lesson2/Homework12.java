package lesson2;

public class Homework12 {
    public static void main(String[] args) {
      int f1 = 0;
      int f2 = 1;
      int f3;
        System.out.println(f1);
        System.out.println(f2);
        for (int i=2;i<11;i++) {
            f3 = f2 + f1;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }

    }
}
