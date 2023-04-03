package lesson9.homework1;

public class Student {
    private String name;
    private int group;

    private static int count = 1;

    public Student(String name, int group) {
        this.name = name;
        this.group = group;
    }

    public Student() {
        this.name = "Ivanov Ivan"+ String.valueOf(count);
        this.group = 101;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }
}
