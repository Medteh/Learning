package day11.task1;

public class Wirehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public void setCountPickedOrders() {
        countPickedOrders++;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountDeliveredOrders() {
        countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "Wirehouse {" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}
