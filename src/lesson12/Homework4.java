package lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Float> students = new HashMap<>();

        while (true) {
            System.out.println("""
                    1 add student
                    2 show students count
                    3 show the worst student
                    4 exit
                    """);
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Write name and mark: ");
                    students.put(scanner.next(), scanner.nextFloat());
                    break;
                case 2:
                    System.out.println(students.size());
                    break;
                case 3:
                    String worstStudent = students.keySet().iterator().next();
                    for (Map.Entry<String, Float> student : students.entrySet()) {
                        if (student.getValue() < students.get(worstStudent)) {
                            worstStudent = student.getKey();
                        }
                    }
                    System.out.println(worstStudent + " - " + students.get(worstStudent));
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

