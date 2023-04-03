package lesson9.homework2;

public class Car {
    private String model;
    private String vin;
    private int year;

    public Car(String model, String vin, int year) {
        this.model = model;
        this.vin = vin;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", year=" + year +
                '}';
    }
}
