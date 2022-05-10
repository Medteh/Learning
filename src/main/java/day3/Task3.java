package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<=4;i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0) {
                System.out.println("Divide by zero");
                continue;
            }
            System.out.println(a/b);
        }
        System.out.println("Program is over");
    }
}
