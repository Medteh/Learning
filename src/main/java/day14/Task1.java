package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int countNumbers = 0;
        int sumNumbers = 0;
        for (String numbers1 : numbers) {
            countNumbers++;
            int numbersInt = Integer.parseInt(numbers1);
            sumNumbers = numbersInt + sumNumbers;
        }

        if (countNumbers != 10) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Incorrect file input");
            }
        }else {
            System.out.println(Arrays.toString(numbers));
            System.out.println("Summa elementov = " + sumNumbers);
            System.out.println("Chislo elementov = " + countNumbers);
        }
        scanner.close();
    }

    public static void main(String[] args) {

            String path = "taskTXT";
            File file = new File(path);
        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
