package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt";
        Scanner scanner = new Scanner(new File(path), "UTF-8");
        Map<Integer, Point> taxiCars = new TreeMap<>();

        while (scanner.hasNextLine()) {
            String[] strArray = scanner.nextLine().split(" ");
            int[] intArr = new int[strArray.length];
                for (int i = 0; i < strArray.length; i++)
                    intArr[i] = Integer.parseInt(strArray[i]);
            taxiCars.put(intArr[0], new Point(intArr[1], intArr[2]));
        }

        Scanner scannerX1 = new Scanner(System.in);
            System.out.println("Введите координаты первой точки");
                int x1 = scannerX1.nextInt();
                int y1 = scannerX1.nextInt();
                System.out.println("x1 = " + x1 + ", y1 = " + y1);
            System.out.println("Введите координаты второй точки");
                int x2 = scannerX1.nextInt();
                int y2 = scannerX1.nextInt();
                System.out.println("x2 = " + x2 + ", y2 = " + y2);

        List <Integer> listOfCars = new ArrayList<>();
            int j = 0;
            for (Map.Entry entries: taxiCars.entrySet()) {
                Point point = (Point) entries.getValue();
                if (point.getX() > x1 && point.getY() > y1 &&
                        point.getX() < x2 && point.getY() < y2) {
                    listOfCars.add((Integer) entries.getKey());
                    j++;
                }
            }
            System.out.println(listOfCars);
            System.out.println("Всего в заданном квадрате находятся " + j + " машин");
    }
}

