package lesson8.p1;

import java.util.Calendar;

public abstract class Animal {
    private int animal_id;
    private String name;
    private Calendar birthday;

    public Animal(int animal_id) {
        this.animal_id = animal_id;
    }

    public Animal() {
    }

    public abstract void voice();
}
