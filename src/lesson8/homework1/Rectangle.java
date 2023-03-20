package lesson8.homework1;

public class Rectangle implements Figure {
    private float a, b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public float perimeter() {
        return a * 2 + b * 2;
    }

    @Override
    public float area() {
        return a * b;
    }
}
