package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Wirehouse wirehouse;

    public Picker(Wirehouse wirehouse) {
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
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed + '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        wirehouse.setCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (wirehouse.getCountPickedOrders() < 10000) {
            System.out.println("Courier otpravil zapros na bonus, no bonus is not available");
            return;
        }

        if (isPayed) {
            System.out.println("Picker otpravil zapros na bonus, no bonus is payed");
            return;
        }

        salary += 70000;
        isPayed = true;
    }
}
