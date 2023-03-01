package lesson6;

public class Hdd {
    String name;
    int capacity;
    boolean external;

    Hdd() {
        this.name = "Hitachi";
        this.capacity = 500;
        this.external = false;
    }

    Hdd(String name, int capacity, boolean external) {
        this.name = name;
        this.capacity = capacity;
        this.external = external;
    }

    void displayInfo() {
        System.out.printf("Name: %s Capacity: %d External: %s\n", name, capacity, external);
    }
}
