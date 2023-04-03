package lesson11.homework1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Araminta", "01", 8.0f));
        students.add(new Student("Olivia", "01", 9.0f));
        students.add(new Student("Emma", "01", 5.0f));
        students.add(new Student("Charlotte", "01", 6.0f));
        students.add(new Student("Elijah", "01", 3.0f));
        students.add(new Student("Noah", "01", 8.0f));
        students.add(new Student("Anna", "02", 9.0f));
        students.add(new Student("Olivia", "02", 3.0f));
        students.add(new Student("Grate", "02", 8.0f));
        students.add(new Student("Amelia", "02", 7.0f));
        students.add(new Student("Lion", "03", 6.0f));
        students.add(new Student("Maya", "03", 8.0f));
        students.add(new Student("Greg", "03", 7.0f));

        System.out.println("Students with mark 8+");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMark() >= 8) {
                System.out.println(students.get(i).getName());
            }
        }
        System.out.println("");
        Map<String, Integer> groupCount = new HashMap<>();
        for (int i = 0; i < students.size(); i++) {
            if (!groupCount.containsKey(students.get(i).getGroup())) {
                groupCount.put(students.get(i).getGroup(), 1);
            } else {
                groupCount.replace(students.get(i).getGroup(), groupCount.get(students.get(i).getGroup()) + 1);
            }
        }
        int min = Integer.MAX_VALUE;
        String minGroup = "";
        for (Map.Entry<String, Integer> item : groupCount.entrySet()) {
            if (min > item.getValue()) {
                min = item.getValue();
                minGroup = item.getKey();
            }
        }
        System.out.println("Group " + minGroup + " has minimal students - " + min);
    }
}
