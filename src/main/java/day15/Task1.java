package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void csvSortToTxtFile(File fileInput, File fileOutput) throws FileNotFoundException {
        if (fileInput.length()==0) {
            try {
                throw new FileSystemAlreadyExistsException();
            }catch (FileSystemAlreadyExistsException e) {
                System.out.println("You input name of empty file.\nPlease repeat one");
            }
            return;
        }
        Scanner scanner = new Scanner(fileInput);
        List<String> listOfSHoes = new ArrayList<>();
        List<String> listOfAbscentShoes = new ArrayList<>();

        while (scanner.hasNextLine()) {
            listOfSHoes.add(scanner.nextLine());
        }

        for (String stringOfShoes : listOfSHoes) {
            String stringOfShoes1 = stringOfShoes.replace(';', ',');
            String[] stringShoes = stringOfShoes1.split(",");
                if (stringShoes.length !=3) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Incorrect count of columns");
                    }
                return;
                }
            int countOnWarehouse = Integer.parseInt(stringShoes[2]);
            if (countOnWarehouse == 0) {
                listOfAbscentShoes.add(stringOfShoes1);
            }
        }
        PrintWriter printWriter = new PrintWriter(fileOutput);
        for (String list: listOfAbscentShoes) {
            printWriter.println(list);
        }
        System.out.println("Program is finished");
        printWriter.close();
        scanner.close();
    }

    public static void main(String[] args)  {
        try {
            csvSortToTxtFile(new File("D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\shoes.csv"),
                            new File("D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\missing_shoes"));
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect file input");
        }
    }
}
