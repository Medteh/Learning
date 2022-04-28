package day8;

class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "Manufacturer " + manufacturer + "\n" +
                "Year of production " + year + "\n" +
                "Length " + length + "\n" +
                "Weight " + weight;
    }
}