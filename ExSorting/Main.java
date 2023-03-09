import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        Quadrangle[] quads = {new Quadrangle(4,3),new Quadrangle(6,2),new Quadrangle(5,2), new Quadrangle(2,2), new Quadrangle(1,10)};
        
        System.out.println("Natural");
        Arrays.sort(quads);
        displayArray(quads);

        System.out.println("Absolute CIRCUIT");
        Arrays.sort(quads, Quadrangle.BY_CIRCUIT);
        displayArray(quads);

    }

    
    public static void displayArray(Quadrangle[] quads){
        for (Quadrangle q : quads) {
            System.out.println(q);
        }
        System.out.println();
    }
}