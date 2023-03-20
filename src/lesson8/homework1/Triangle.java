package lesson8.homework1;

public class Triangle implements Figure {
    private float a, b, c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float perimeter() {
        return a + b + c;
    }

    public float area() {
        float p = perimeter() / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
