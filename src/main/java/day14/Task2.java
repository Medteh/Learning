package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<String> lines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        for (String lines1 : lines) {
            String[] stringNumbers = lines1.split(" ");
            int age = Integer.parseInt(stringNumbers[1]);
            if (age < 0) {
                try {
                    throw new ConcurrentModificationException();
                }catch (ConcurrentModificationException e) {
                    System.out.println("Incorrect file");
                    lines.clear();
                    return lines;
                }
            }
        }
        scanner.close();
        return lines;
    }

    public static void main(String[] args) {
        String path = "people";
        File file = new File(path);
        try {
            System.out.println(parseFileToStringList(file));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
