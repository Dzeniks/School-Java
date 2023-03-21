public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car("Toyota", "Corolla", 2020);
        vehicles[1] = new Car("Honda", "Civic", 2022);
        vehicles[2] = new Motorbike("Harley-Davidson", "Iron", 2019);
        vehicles[3] = new Motorbike("BMW", "GS", 2021);
        vehicles[4] = new Car("Tesla", "S", 2023);
        
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.accelerate(30);
            vehicle.accelerate(20);
            vehicle.accelerate(10);
            vehicle.stop();
            System.out.println();
        }
    }
}