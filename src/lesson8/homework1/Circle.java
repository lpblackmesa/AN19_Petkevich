package lesson8.homework1;

public class Circle implements Figure {
    private float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public float perimeter() {
        return (float) (2 * 3.14 * r);
    }

    @Override
    public float area() {
        return (float) (3.14 * r * r);
    }
}
