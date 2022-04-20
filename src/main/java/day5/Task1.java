package day5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Car volkswagen = new Car();
        volkswagen.setModel("Tuareg");
        volkswagen.setColor("Black");
        volkswagen.setYearOfProduction(1998);

        volkswagen.getModel();
        volkswagen.getColor();
        volkswagen.getYearOfProduction();
    }
}

class Car {
    private String model;
    private String color;
    private int yearOfProduction;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        System.out.println(model);
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        System.out.println(color);
        return color;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getYearOfProduction() {
        System.out.println(yearOfProduction);
        return yearOfProduction;
    }
}