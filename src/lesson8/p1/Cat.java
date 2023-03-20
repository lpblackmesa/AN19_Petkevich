package lesson8.p1;

public class Cat extends Animal
{
    private String eyesColor;

    public Cat(int animal_id, String eyesColor) {
        super(animal_id);
        this.eyesColor = eyesColor;
    }

    public Cat() {
    }

    @Override
    public void voice() {
        System.out.printf("Meow");
    }
}

