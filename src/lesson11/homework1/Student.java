package lesson11.homework1;

public class Student {
    private String name, group;
    private float mark;

    private static int count = 1;

    public Student(String name, String group, float mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }
    
    public float getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }
}

