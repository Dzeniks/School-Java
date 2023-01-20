package Traffic;
import java.awt.Color;

public class Main{

    public static void main(String[] args) {
        
        Car Car1 = new Car("Fiat", 2, 50, Color.GREEN);
        Car1.reFuel();
        System.out.print(Car1);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(Car1.drive(50));
        System.out.println(Car1.drive(50));
        

        System.out.printf("\nWanted drive %s and drive distance: %s\n", 50, Car1.drive(50));
        
        System.out.println(Car1);
        System.out.printf("\n %s \n", Car1.reFuel());
        
        System.out.println(Car1);
    }
    
    
}