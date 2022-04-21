package day6;


class Motorbike {
    private String model;
    private String color;
    private int yearOfProduction;

    public Motorbike(String model, String color, int yearOfProduction) {
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

    public void info() {
        System.out.println("This is the Motorbike");
    }

    public int yearDifference (int inputYear) {
        int yearDifference = Math.abs(inputYear - yearOfProduction);
        return yearDifference;
    }
}