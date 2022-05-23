package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.util.*;

public class Task2 {
    public static final int DECIMAL = 20;
    public static final int ARRAY_DIMENSION = 1000;
    public static final int BOUND_OF_RANDOM = 100;
    public static final String NAME_OF_FILE_RANDOM_NUMBERS = "file1.txt";
    public static final String NAME_OF_FILE_AVERAGE_NUMBERS = "file2.txt";

    public static void createFileRandomNumbers() throws FileNotFoundException {
        File file1 = new File(NAME_OF_FILE_RANDOM_NUMBERS);
        Random random = new Random();
        PrintWriter printWriter1 = new PrintWriter(file1);
        for (int i = 0; i < ARRAY_DIMENSION; i++)
            printWriter1.print(random.nextInt(BOUND_OF_RANDOM) + 1 + " ");
        printWriter1.close();
    }

    public static void createFileAverageNumbers() throws FileNotFoundException {
        File file2 = new File(NAME_OF_FILE_AVERAGE_NUMBERS);
        PrintWriter printWriter2 = new PrintWriter(file2);
        Scanner scanner = new Scanner(new File(NAME_OF_FILE_RANDOM_NUMBERS));
        String line = scanner.nextLine();
        String[] arrOfTwentyNumbers = line.split(" ");
        int[] arrOfIntNumbers = new int[ARRAY_DIMENSION];
        int sumOfTwentyElements = 0;
        for (int i = 0; i < arrOfTwentyNumbers.length; i++) {
            arrOfIntNumbers[i] = Integer.valueOf(arrOfTwentyNumbers[i]);
            sumOfTwentyElements += arrOfIntNumbers[i];
            if (i % 20 == 0 && i != 0) {
                printWriter2.print((sumOfTwentyElements / (double) DECIMAL) + " ");
                sumOfTwentyElements = 0;
            }
        }
        printWriter2.close();
    }

    public static void printResult() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(NAME_OF_FILE_AVERAGE_NUMBERS));
        String listOfAverageNumbers = scanner.nextLine();
        String[] listOfAverageNumber = listOfAverageNumbers.split(" ");
        double sumOfAverageElements = 0;

        for (String averageNumbers : listOfAverageNumber)
            sumOfAverageElements += Double.parseDouble(averageNumbers);
        System.out.println((int) sumOfAverageElements);
    }

    public static void main(String[] args) throws IOException {
        createFileRandomNumbers();
        createFileAverageNumbers();
        printResult();
    }
}
