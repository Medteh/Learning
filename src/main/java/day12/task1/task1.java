package day12.task1;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<String> listOfCars = new ArrayList<>();
        listOfCars.add("VAZ");
        listOfCars.add("Pegeout");
        listOfCars.add("BMW");
        listOfCars.add("Mercedes-BENZ");
        listOfCars.add("AUDI");

        System.out.println(listOfCars);
        System.out.println();

        listOfCars.add(2, "Volkswagen");
        System.out.println(listOfCars);
        System.out.println();

        listOfCars.remove(0);
        System.out.println(listOfCars);

    }
}
