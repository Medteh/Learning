package day2;

import java.awt.*;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        double x;
        x = scanner.nextDouble();
        double y;
        if (x >= 5) {
            y = (pow(x,2) - 10) / (x + 7);
            System.out.println(y);
        }
        if (x > -3 && x < 5) {
            y = (x + 3) * (pow(x,2)- 2);
            System.out.println(y);
        } if (x<-3) {
            y = 420;
            System.out.println(y);
        }
    }
}
