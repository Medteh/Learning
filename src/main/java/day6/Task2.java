package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing", 2003, 35, 350);
        boeing.setYear(1999);
        boeing.setLength(40);
        boeing.fillUp(200);
        boeing.fillUp(180);
        boeing.info();
    }
}

class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    void info() {
        System.out.println("Manufacturer " + manufacturer+"\n" + "Year of production " + year +"\n"+ "Length " + length + "\n"+"Weight " + weight +"\n"+ "Fuel " + fuel);
    }

    public int fillUp(int n) {
        this.fuel = n;
        return fuel;
    }
}