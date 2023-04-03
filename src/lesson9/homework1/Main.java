package lesson9.homework1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate date;
        University university1 = new University();

        university1.getTimetable("Igor Nigga", LocalDate.of(2023, 04, 01));
        university1.getTimetable("Anton Kaz", LocalDate.now());
        //Wrong date
        university1.getTimetable("Igor Nigga", LocalDate.of(2024, 04, 01));
        //Wrong name
        university1.getTimetable("Qnton Kaz", LocalDate.now());

    }
}
