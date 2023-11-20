package n3exercici1;

import n3exercici1.tasks.AccelerateOrder;
import n3exercici1.tasks.StartOrder;
import n3exercici1.tasks.StopOrder;
import n3exercici1.vehicles.Bike;
import n3exercici1.vehicles.Boat;
import n3exercici1.vehicles.Car;
import n3exercici1.vehicles.Plane;

public class Main {
    public static void main (String[] args) {
        Car car1 = new Car("Car 1");
        Bike bike1 = new Bike("Bike 1");
        Boat boat1 = new Boat("Boat 1");
        Plane plane1 = new Plane("Plane 1");

        TaskBroker broker = new TaskBroker();

        broker.takeOrder(new StartOrder(car1));
        broker.takeOrder(new StartOrder(bike1));
        broker.takeOrder(new StartOrder(boat1));
        broker.takeOrder(new StartOrder(plane1));

        broker.takeOrder(new AccelerateOrder(car1));
        broker.takeOrder(new AccelerateOrder(bike1));
        broker.takeOrder(new AccelerateOrder(boat1));
        broker.takeOrder(new AccelerateOrder(plane1));

        broker.takeOrder(new StopOrder(car1));
        broker.takeOrder(new StopOrder(bike1));
        broker.takeOrder(new StopOrder(boat1));
        broker.takeOrder(new StopOrder(plane1));

        broker.placeOrders();
    }
}
