package n3exercici1.tasks;

import n3exercici1.vehicles.Vehicle;

public class StartOrder implements Order {
    private Vehicle vehicle;

    public StartOrder (Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.start();
    }
}
