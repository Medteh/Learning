package day7;

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

    public int getLength() {return length; }

    void info() {
        System.out.println("Manufacturer " + manufacturer + "\n" + "Year of production " + year + "\n" + "Length " + length + "\n" + "Weight " + weight + "\n" + "Fuel " + fuel);
    }

    public void fillUp(int n) {
        this.fuel = this.fuel + n;
    }

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2) {
       if (airplane1.getLength() > airplane2.getLength()) {
           System.out.println("First airplane is much begger than second");
       } else System.out.println("Second airplane is bigger than first");
    }
}