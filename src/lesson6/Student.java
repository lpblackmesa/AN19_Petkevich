package lesson6;

public class Student {
    String name;
    int mark, group;

    Student() {
        this.mark = 5;
        this.group = 1;
    }

    Student(int mark) {
        this.mark = mark;
        this.group = 1;
    }

    void display() {
        System.out.printf("Name: %s Group: %d Mark: %d \n", name, group, mark);
    }
}


