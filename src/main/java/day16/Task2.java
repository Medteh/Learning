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
    public static final int Decimal = 20;
    public static final int ArrayDimension = 1000;
    public static final int BoundOfRandom = 100;
    public static final String NameOfFileRandomNumbers = "file1.txt";
    public static final String NameOfFileAverageNumbers = "file2.txt";

    public static void createFileRandomNumbers() throws FileNotFoundException {
            File file1 = new File(NameOfFileRandomNumbers);
            Random random = new Random();
            PrintWriter printWriter1 = new PrintWriter(file1);
            for (int i = 0; i <= ArrayDimension; i++)
                printWriter1.print(random.nextInt(BoundOfRandom) + 1 + " ");
            printWriter1.close();
    }

    public static void createFileAverageNumbers() throws FileNotFoundException {
            File file2 = new File(NameOfFileAverageNumbers);
            PrintWriter printWriter2 = new PrintWriter(file2);
            Scanner scanner = new Scanner(new File(NameOfFileRandomNumbers));
            String line = scanner.nextLine();
            String[] listOfTwentyNumbers = line.split(" ");

            int[] listOfIntNumbers = new int[ArrayDimension];
            for (int i = 0; i < ArrayDimension; i++) {
                listOfIntNumbers[i] = Integer.valueOf(listOfTwentyNumbers[i]);
            }
            for (int i = 0; i <= ArrayDimension; i+= Decimal) {
                int[] arrayOfTwentyNumbers = Arrays.copyOfRange(listOfIntNumbers, i, i + Decimal);
                int sumOfTwentyElements = 0;
                for (int numbers: arrayOfTwentyNumbers)
                    sumOfTwentyElements += numbers;
                printWriter2.print((sumOfTwentyElements / (double) Decimal) + " ");
            } printWriter2.close();
    }

    public static void printResult() throws FileNotFoundException {
            Scanner scanner = new Scanner(new File(NameOfFileAverageNumbers));
            String listOfAverageNumbers = scanner.nextLine();
            String[] listOfAverageNumber = listOfAverageNumbers.split(" ");
            double sumOfAverageElements = 0;

            for (String averageNumbers: listOfAverageNumber)
                sumOfAverageElements += Double.parseDouble(averageNumbers);
            System.out.println((int) sumOfAverageElements);
    }

    public static void main(String[] args) throws IOException {
        createFileRandomNumbers();
        createFileAverageNumbers();
        printResult();

    }
}
