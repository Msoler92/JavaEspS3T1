package n3exercici1.vehicles;

public class Boat implements Vehicle {
    private String id;
    public Boat (String id) {
        this.id = id;
    }
    public void start() {
        System.out.println("Boat with ID " + id + " starting up.");
    }
    public void accelerate() {
        System.out.println("Boat with ID " + id + " accelerating.");
    }
    public void stop() {
        System.out.println("Boat with ID " + id + " stopping.");
    }
}
