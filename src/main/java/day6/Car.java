package day6;

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

    public void info() {
        System.out.println("This is the Car");
    }

    public int yearDifference (int inputYear) {
        int yearDifference = Math.abs(inputYear-yearOfProduction);
        return yearDifference;
    }
}