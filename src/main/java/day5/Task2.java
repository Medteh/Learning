package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("Suzuki", "Black",1985);
        motorbike1.getModel();
        motorbike1.getColor();
        motorbike1.getYearOfProduction();
    }
}

class Motorbike {
    private String model;
    private String color;
    private int yearOfProduction;

    public Motorbike (String model, String color, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        System.out.println(model);
        return model;
    }

    public String getColor() {
        System.out.println(color);
        return color;
    }

    public int getYearOfProduction() {
        System.out.println(yearOfProduction);
        return yearOfProduction;
    }
}