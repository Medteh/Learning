package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void printResult() throws FileNotFoundException {
        File file = new File ("taskDay16");
        try {
            if (file.length() == 0) throw new FileSystemException("File is empty");
            Scanner scanner = new Scanner(file);
            String listNumber = scanner.nextLine();
            String[] arrayNumber = listNumber.split(" ");
            List<Integer> listOfNumber = new ArrayList<>();
            double sumOfNumbers = 0;
            double averageNumbers = 0;
            for (int i = 0; i < arrayNumber.length; i++) {
                listOfNumber.add(Integer.parseInt(arrayNumber[i]));
                sumOfNumbers += listOfNumber.get(i);
            }
            averageNumbers = sumOfNumbers / listOfNumber.size();
            BigDecimal averageNumbersThree = new BigDecimal(averageNumbers);
            averageNumbersThree = averageNumbersThree.setScale(3, BigDecimal.ROUND_CEILING);

            System.out.println(listOfNumber);
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

