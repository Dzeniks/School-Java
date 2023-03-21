public class Car implements Vehicle {
    private String make;
    private String model;
    private int year;
    private int currentSpeed;
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void start() {
        System.out.println("The " + year + " " + make + " " + model + " has started.");
    }
    
    public void stop() {
        System.out.println("The " + year + " " + make + " " + model + " has stopped.");
    }
    
    public void accelerate(int speed) {
        currentSpeed += speed;
        System.out.println("The " + year + " " + make + " " + model + " is now going " + currentSpeed + " mph.");
    }
}