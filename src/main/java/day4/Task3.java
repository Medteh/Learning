package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] doubleArray = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = random.nextInt(50);
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }

        int maximumIdx=0;
        int maximum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            int sumElementpoStrokam = 0;
            for (int j = 0; j < doubleArray[i].length; j++) sumElementpoStrokam += doubleArray[i][j];
            if (sumElementpoStrokam >= maximum) {
                maximum = sumElementpoStrokam;
                maximumIdx=i;
            }
        }
        System.out.println("Maximum index of string "+maximumIdx);
    }
}
