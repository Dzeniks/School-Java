import java.lang.Math;

public class Circle extends Shape {

    protected double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public Double circumference() {
        return 2*Math.PI*r;
    }

    @Override
    public Double area() {
        return Math.PI*Math.pow(r, 2);
    }
}
