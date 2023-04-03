package lesson9.homework2;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.addCar(new Car("audi", "abc1", 2010));
        parking.addCar(new Car("wv", "abc2", 2005));
        parking.addCar(new Car("bmw", "abc3", 2000));
        parking.addCar(new Car("volvo", "abc4", 1990));

        parking.checkCar("abc2");
        System.out.println("Count of cars - " + parking.countByYears(15));
        try {
            parking.checkCar("abc5");
        } catch (VinExeption e) {
            System.out.println(e);
        }


    }
}
