package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Input numbers A and B");
        Scanner scanner1 = new Scanner(System.in);
        int A = scanner1.nextInt();
        int B = scanner1.nextInt();
        if (A>B) {
            System.out.println("Error input");
        } else{
            A = A + 1;
            while (A < B) {
                if (A % 5 == 0 && A % 10 != 0) {
                    System.out.print(A + " ");
                }
                A++;
            }
        }

    }
}
