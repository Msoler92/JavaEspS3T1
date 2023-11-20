package n3exercici1.tasks;

import n3exercici1.vehicles.Vehicle;

public class AccelerateOrder implements Order{
    private Vehicle vehicle;

    public AccelerateOrder (Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.accelerate();
    }
}
