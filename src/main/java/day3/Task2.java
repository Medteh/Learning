package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double value1 = scanner.nextDouble();
            double value2 = scanner.nextDouble();
            if (value2 == 0) break;
            double itogValue = value1 / value2;
            System.out.println(itogValue);
        }
    }
}
