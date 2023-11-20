package n3exercici1;

import n3exercici1.tasks.Order;

import java.util.ArrayList;

public class TaskBroker {
    private ArrayList<Order> orderList;

    public TaskBroker() {
        orderList = new ArrayList<>();
    }
    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        orderList.forEach(Order::execute);
    }

}
