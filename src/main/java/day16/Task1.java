package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void printResult() {
        File file = new File ("taskDay16");
        try {
            if (file.length() == 0) throw new FileSystemException("File is empty");
            Scanner scanner = new Scanner(file);
            String listNumber = scanner.nextLine();
            String[] arrayNumber = listNumber.split(" ");
            double sumOfNumbers = 0;
            double averageNumbers = 0;
            for (int i = 0; i < arrayNumber.length; i++)
                sumOfNumbers += Integer.parseInt(arrayNumber[i]);

            averageNumbers = sumOfNumbers / arrayNumber.length;
            BigDecimal averageNumbersThree = new BigDecimal(averageNumbers);
            averageNumbersThree = averageNumbersThree.setScale(3, BigDecimal.ROUND_CEILING);

            System.out.println(Arrays.toString(arrayNumber));
            System.out.println(averageNumbers);
            System.out.println(averageNumbersThree);

        }catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }catch (FileSystemException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
            printResult();
    }
}

