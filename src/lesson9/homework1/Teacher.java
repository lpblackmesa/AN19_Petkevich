package lesson9.homework1;

public class Teacher {
    private String name, subject, room;
    private static int count = 1;

    public Teacher(String name, String subject, String room) {
        this.name = name;
        this.subject = subject;
        this.room = room;
    }

    public Teacher() {
        this.name = "Sidor Sidorovich"+ String.valueOf(count);
        this.subject = "History";
        this.room = "999";
        count++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Room " + room +
                " Teacher " + name +
                ", subject " + subject + "\n";
    }
}
