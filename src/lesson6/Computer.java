package lesson6;

public class Computer {
    String model;
    int price;
    Hdd hdd;
    Ram ram;

    Computer(String model, int price) {
        this.model = model;
        this.price = price;
        this.hdd = new Hdd();
        this.ram = new Ram();
    }

    Computer(String model, int price, String hdd_model, int hdd_capacity, boolean hdd_external, int ram_capacity, String ram_model) {
        this.model = model;
        this.price = price;
        this.hdd = new Hdd(hdd_model, hdd_capacity, hdd_external);
        this.ram = new Ram(ram_model, ram_capacity);
    }

    void displayInfo() {
        System.out.printf("Model: %s Price: %d HDD Model: %s HDD Capacity: %d External HDD: %s \n" +
                "RAM Model: %s RAM Capacity: %d\n", model, price, hdd.name, hdd.capacity, hdd.external, ram.model, ram.capacity);
    }
}