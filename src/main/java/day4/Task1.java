package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(10);
        System.out.println(Arrays.toString(array));
        System.out.println("Array length " + array.length);

        int valueLarger8 = 0;
        for (int i : array) {
            if (i > 8) valueLarger8++;
        }
        System.out.println("Number of values larger than 8: " + valueLarger8);

        int valueIs1 = 0;
        for (int i : array) {
            if (i == 1) valueIs1++;
        }
        System.out.println("Number of values is " + valueIs1);

        int QtyOfEvenNumbers = 0;
        for (int i : array) {
            if (i % 2 == 0) QtyOfEvenNumbers++;
        }
        System.out.println("Quantity of even numbers is " + QtyOfEvenNumbers);

        int QtyOfOddNumbers = 0;
        for (int i : array) {
            if (i % 2 != 0) QtyOfOddNumbers++;
        }
        System.out.println("Quantity of uneven numbers is " + QtyOfOddNumbers);

        int sum = 0;
        for (int i : array) sum = sum + i;
        System.out.println("Sum of array values is " + sum);
    }
}
