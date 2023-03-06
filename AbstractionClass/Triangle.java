import java.lang.Math;

public class Triangle extends Shape {

    protected double a, b, c;

    public Triangle(String color, float a, float b, float c) {
        super(color);
        this.a = a;
        this.b = a;
        this.c = c;
    }

    @Override
    public Double circumference() {
        return (double) a + b + c;
    }

    @Override
    public Double area() {
        double s = (circumference()/2);
        return (double) Math.sqrt((double)(s*(s-a)*(s-b)*(s-c)));
    }

    public boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}