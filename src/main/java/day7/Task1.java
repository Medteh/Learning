package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 1985, 26, 385 );
        Airplane airplane2 = new Airplane("Airbus", 2013, 35, 160);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}