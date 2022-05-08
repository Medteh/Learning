package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private boolean isPayed;
    private Wirehouse wirehouse;

    public Courier(Wirehouse wirehouse) {
        this.wirehouse = wirehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed + '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        wirehouse.setCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (wirehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Courier otpravil zapros na bonus, no bonus is not available");
            return;
        }

        if (isPayed) {
            System.out.println("Courier otpravil zapros na bonus, no bonus is payed");
            return;
        }

        salary += 50000;
        isPayed = true;
    }
}
