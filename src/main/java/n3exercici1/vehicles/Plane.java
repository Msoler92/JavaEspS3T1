package n3exercici1.vehicles;

public class Plane implements Vehicle {
    private String id;
    public Plane (String id) {
        this.id = id;
    }
    public void start() {
        System.out.println("Plane with ID " + id + " starting up.");
    }
    public void accelerate() {
        System.out.println("Plane with ID " + id + " accelerating.");
    }
    public void stop() {
        System.out.println("Plane with ID " + id + " stopping.");
    }
}
