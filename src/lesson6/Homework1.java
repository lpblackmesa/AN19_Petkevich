package lesson6;

public class Homework1 {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Comp1", 1000);
        comp1.displayInfo();
        Computer comp2 = new Computer("Comp1", 1500, "Samsung", 2000, false, 8, "Samsung");
        comp2.displayInfo();
    }
}
