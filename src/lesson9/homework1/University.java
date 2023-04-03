package lesson9.homework1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;

public class University {
    List<Student> students = new ArrayList<Student>();
    Map<LocalDate, DayTimetable> university = new HashMap<LocalDate, DayTimetable>();

    public University() {
        //Create and add students
        students.add(new Student("Igor Nigga", 101));
        students.add(new Student("Samuel Brown", 101));
        students.add(new Student("Anton Kaz", 102));
        students.add(new Student("John Strannik", 102));
        //Create teachers
        Teacher t1 = new Teacher("Thomas Evans", "Chemistry", "410");
        Teacher t2 = new Teacher("Alfie Aldridge", "Biology", "115");
        Teacher t3 = new Teacher("Alex Allen", "History", "225");
        //Create timeTable for groups
        GroupTimeTable g101 = new GroupTimeTable(101);
        g101.addCouple(t1);
        g101.addCouple(t3);
        g101.addCouple(t2);
        GroupTimeTable g102 = new GroupTimeTable(102);
        g102.addCouple(t3);
        g102.addCouple(t3);
        g102.addCouple(t1);
        GroupTimeTable g101_2 = new GroupTimeTable(101);
        g101_2.addCouple(t1);
        g101_2.addCouple(t1);
        g101_2.addCouple(t2);
        //Create timetable for all groups
        DayTimetable day1 = new DayTimetable();
        day1.addTimetable4group(g101);
        day1.addTimetable4group(g102);
        DayTimetable day2 = new DayTimetable();
        day2.addTimetable4group(g101_2);
        //Create timetable for day
        university.put(LocalDate.now(), day1);
        university.put(LocalDate.of(2023, 04, 01), day2);

    }

    public void getTimetable(String studentName, LocalDate date) {
        int group = 0;
        for (int i = 0; i < students.size(); i++) {
            if (studentName.equals(students.get(i).getName())) {
                group = students.get(i).getGroup();
            }
        }
        if (group != 0) {
            try {
                university.get(date).getTimetable4group(group);
            } catch (NullPointerException e) {
                System.out.println("Date is not found");
            }
        } else {
            System.out.println("Name is not found");
        }
    }
}



