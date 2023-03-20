package lesson8.p1;

import java.math.BigDecimal;

public class Dog extends Animal
{
    private BigDecimal weight;

    public Dog(int animal_id, BigDecimal weight) {
        super(animal_id);
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.printf("Wof!");
    }
}
