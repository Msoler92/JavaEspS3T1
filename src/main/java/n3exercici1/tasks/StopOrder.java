package n3exercici1.tasks;

import n3exercici1.vehicles.Vehicle;

public class StopOrder implements Order{
    private Vehicle vehicle;

    public StopOrder (Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.stop();
    }
}
