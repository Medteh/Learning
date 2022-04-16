package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of floors of the building");
        Scanner s = new Scanner(System.in);
        int floors = s.nextInt();
        if (floors >= 1 && floors <= 4) {
            System.out.println("Low-rise bulding");
        } else if (floors >= 5 && floors <= 8) {
            System.out.println("Mid-rise building");
        } else if (floors >= 9) {
            System.out.println("High-rise building");
        } else System.out.println("Input error");
    }
}
