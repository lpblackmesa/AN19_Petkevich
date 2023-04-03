package lesson9.homework2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Parking {
    List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void checkCar(String vin) throws VinExeption {
        int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getVin().equals(vin)) {
                count++;
                System.out.println(cars.get(i).toString());
            }
        }
        if (count == 0) {
            throw new VinExeption("There is no VIN");
        }

    }

    public int countByYears(int years) {
        int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getYear() <= LocalDate.now().getYear() - years) {
                count++;
            }
        }
        return count;
    }
}

