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

    public static List<Human> parseFileToObjList(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<Human> human = new ArrayList<>();
        List<String> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }

        for (String listHuman: list) {
            String[] instanceHuman = listHuman.split(" ");
            String name = instanceHuman[0];
            int age = Integer.parseInt(instanceHuman[1]);
            if (age < 0) {
                try {
                    throw new ConcurrentModificationException();
                } catch (ConcurrentModificationException e) {
                    System.out.println("Incorrect file input");
                    human.clear();
                    break;
                }
            }
            human.add(new Human(name,age));
        }
        return human;
    }
}
