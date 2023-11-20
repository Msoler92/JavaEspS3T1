package n3exercici1.vehicles;

public class Bike implements Vehicle{
    private String id;
    public Bike (String id) {
        this.id = id;
    }
    public void start() {
        System.out.println("Bike with ID " + id + " starting up.");
    }
    public void accelerate() {
        System.out.println("Bike with ID " + id + " accelerating.");
    }
    public void stop() {
        System.out.println("Bike with ID " + id + " stopping.");
    }
}
