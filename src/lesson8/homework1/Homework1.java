package lesson8.homework1;

public class Homework1 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 2, 6);
        figures[1] = new Rectangle(4, 4);
        figures[2] = new Circle(4);
        figures[3] = new Circle(2);
        figures[4] = new Rectangle(2.2f, 5);
        float perimetr = 0;
        for (int i = 0; i < 5; i++) {
            perimetr += figures[i].perimeter();
        }
        System.out.println(perimetr);
    }
}
