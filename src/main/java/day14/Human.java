package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Scanner;

public class Human {
    private String name;
    private int age;

    private Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Human> parseFileToObjList() throws FileNotFoundException {
        File file = new File ("people");
        try {
            Scanner scanner = new Scanner(file);
            List<Human> human = new ArrayList<>();

            while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] currentLine = line.split(" ");

            if (Integer.parseInt(currentLine[1]) < 0)
                throw new ConcurrentModificationException("Incorrect file input");
            Human currentHuman = new Human (currentLine[0], Integer.parseInt(currentLine[1]));
            human.add(currentHuman);
            }
            return human;

        } catch (ConcurrentModificationException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        return null;
    }
}
