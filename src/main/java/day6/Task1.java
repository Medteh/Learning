package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike suzuki = new Motorbike("Suzuki", "Orange", 2013);

        suzuki.info();
        System.out.println(suzuki.yearDifference(2022));
    }
}
