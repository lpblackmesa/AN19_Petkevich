package lesson6;

public class Ram {
    String model;
    int capacity;

    Ram() {
        this.model = "Hynix";
        this.capacity = 4;
    }

    Ram(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    void displayInfo() {
        System.out.printf("Name: %s Capacity: %d\n", model, capacity);
    }
}
