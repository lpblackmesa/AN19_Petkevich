package lesson8.p1;

public class Tiger extends Cat
{
    private int countEatenExplorers;

    public Tiger(int animal_id, String eyesColor, int countEatenExplorers) {
        super(animal_id, eyesColor);
        this.countEatenExplorers = countEatenExplorers;
    }

}
