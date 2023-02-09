package Traffic;
import java.awt.Color;

public class Car {

    private String brand;
    private float mileAge;
    private float averageComp;
    private float fuelLevel;
    private float tankVolume;
    private Color color;
    
    public Car(String brand, float averageComp, float tankVolume, Color color) {
        this.brand = brand;
        this.averageComp = averageComp;
        this.tankVolume = tankVolume;
        this.color = color;

        this.mileAge = 0;
        this.fuelLevel = 0;
    }

    public float reFuel(float AddeFuel){
        if ((AddeFuel + tankVolume) >= tankVolume){
            this.fuelLevel = tankVolume;
            return fuelLevel;
        }
        this.fuelLevel += AddeFuel;
        return fuelLevel;
    }

    public float reFuel(){
        float Bfuel = this.tankVolume - this.fuelLevel;
        this.fuelLevel += Bfuel;
        return Bfuel;
    }

    public float drive(float distance){
        float Range = 100 * fuelLevel / averageComp;
        if (Range < distance){
            mileAge += Range;
            fuelLevel = 0;
            return Range;
        }
        mileAge += distance;
        fuelLevel -= (distance * averageComp/100);
        return distance;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", mileAge=" + mileAge + ", averageComp=" + averageComp + ", fuelLevel="
                + fuelLevel + ", tankVolume=" + tankVolume + ", color=" + color + "]";
    }

}
