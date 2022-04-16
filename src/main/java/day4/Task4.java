package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);
        System.out.println(Arrays.toString(array));

        int upperBound = array.length - 2;
        int sumArrayThreeElem = 0;
        int IndexOfFirstElem = 0;

        int element1 = 0;
        int element2 = 0;
        int element3 = 0;
        for (int i = 0; i < upperBound; i++) {
            int sum = array[i] + array[i + 1] + array[i + 2];
            if (sum >= sumArrayThreeElem) {
                sumArrayThreeElem = sum;
                IndexOfFirstElem = i;
                element1 = array[i];
                element2 = array[i + 1];
                element3 = array[i + 2];
            }
        }

        int[] arrayThreeElem = new int[]{element1, element2, element3};
        System.out.println(Arrays.toString(arrayThreeElem));

        System.out.println(sumArrayThreeElem);
        System.out.println(IndexOfFirstElem);
    }
}
