package day18;

import java.util.Arrays;

public class Task1 {
    private int[] numbers;
    private int i = 0;
    private int sum = 0;

    public Task1(int[] numbers) {
        this.numbers = numbers;
    }

    public void recursionSum() {
        if (i == numbers.length) {
            System.out.println(sum);
            return;
        }
        sum += numbers[i];
        i++;
        recursionSum();

    }

    @Override
    public String toString() {
        return "Task1{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public static void main(String[] args) {
        Task1 numbers = new Task1(new int[] {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311});
        System.out.println(numbers);
        numbers.recursionSum();
    }
}
