package lesson7.homework1;

public class Phone {
    private int number, weight;
    private String model;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.number = 0000000;
        this.model = "undefined";
        this.weight = 10;
    }


    public Phone(int number, int weight, String model) {
        this(number, model);
        this.weight = weight;

    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, int number) {
        setNumber(number);
        System.out.println(name + " is calling. Number is " + number);
    }

    public void sendMessage(int... numbers) {
        System.out.println("Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void show() {
        System.out.println("Model: " + model + " Weight: " + weight + " Number: " + number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
