import java.util.ArrayList;

public class Main{


    public static void main(String[] args) {
        ArrayList<Shape> some = new ArrayList<Shape>();
        some.add(new Circle("red", 5));
        some.add(new Circle("green", 10));
        some.add(new Circle("blue", 15));
        some.add(new Triangle("red", 8, 10, 12));
        some.add(new Triangle("green", 3, 5, 5));
        some.add(new Triangle("blue", 10, 5, 20));


        for (Shape idk : some) {
            System.out.println(idk.circumference());
            System.out.println(idk.area());
            System.out.println();
        }
    }

}