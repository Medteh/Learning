package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random randomValue = new Random();

        for (int i = 0; i < array.length; i++) array[i] = randomValue.nextInt(10000);
        System.out.println(Arrays.toString(array));

        int maximum = array[0];
        for (int arrays : array) {
            if (arrays > maximum) maximum = arrays;
        }
        System.out.println("Maximum value of array " + maximum);

        int minimum = array[0];
        for (int arrays : array) {
            if (arrays < minimum) minimum = arrays;
        }
        System.out.println("Minimum value of array " + minimum);

        int delitelNol = 0;
        int sum = 0;
        for (int arrays : array) {
            if (arrays % 10 == 0) {
                delitelNol++;
                sum = sum + arrays;
            }
        }
        System.out.println("Quantity na nol "+ delitelNol);
        System.out.println("Summa "+sum);


    }
}
