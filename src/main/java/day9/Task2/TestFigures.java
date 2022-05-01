package day9.Task2;

public class TestFigures {
    public static double calculateRedPerimeter(Figure[] figures) {
        double calculateRedPerimeter = 0;
        for (Figure sumPerimetres: figures) {
            if (sumPerimetres.getColor().equals("Red"))
                calculateRedPerimeter = calculateRedPerimeter + sumPerimetres.perimeter();
        }
        return calculateRedPerimeter;
    }

    public static double calculateRedArea(Figure[] figures) {
        double calculateRedArea = 0;
        for (Figure sumSquare: figures) {
            if (sumSquare.getColor().equals("Red"))
                calculateRedArea = calculateRedArea + sumSquare.area();
        }
        return calculateRedArea;
    }

    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green",10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle ("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };
        System.out.println("Summa perimetrov krasnyh figur ravna " + TestFigures.calculateRedPerimeter(figures));
        System.out.println("Summa ploschadei krasnyh figur ravna " + TestFigures.calculateRedArea(figures));
    }
}
