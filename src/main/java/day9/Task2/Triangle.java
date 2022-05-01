package day9.Task2;

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;
    private static int countTriangle = 1;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        if (side1 + side2 > side3 && side1 + side3 > side3 && side2 + side3 > side1) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else System.out.println("Triangle nomer " + countTriangle + " so storonami "
                + side1 + " " + side2 + " " + side3 + " nevozmogno sozdat s takimi storonami. " +
                "VVedite korrektno storonu treugolnika");
        countTriangle++;
    }

    @Override
    public double area() {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
