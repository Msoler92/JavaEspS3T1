package n3exercici1.vehicles;

public class Car implements Vehicle {
    private String id;
    public Car(String id) {
        this.id = id;
    }
    public void start() {
        System.out.println("Car with ID " + id + " starting up.");
    }
    public void accelerate() {
        System.out.println("Car with ID " + id + " accelerating.");
    }
    public void stop() {
        System.out.println("Car with ID " + id + " stopping.");
    }
}
