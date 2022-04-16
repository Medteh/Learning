package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Input numbers A and B");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A >= B) {
            System.out.println("Error input");
        } else {
            for (int i = ++A; i < B; i++) {
                int mod = i % 5;
                int mod2 = i % 10;
                if (mod == 0 && mod2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
