package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (2 < 3) {
            System.out.println("Input city name");
            String city = scanner.nextLine();
            if (city.equals("Stop")) break;
            switch (city) {
                case "Moscow":
                case "Vladivostok":
                case "Rostov":
                    System.out.println("Russia");
                    break;
                case "Roma":
                case "Milan":
                case "Turin":
                    System.out.println("Italy");
                    break;
                case "Liverpool":
                case "Manchester":
                case "London":
                    System.out.println("England");
                    break;
                case "Berlin":
                case "Munchen":
                case "Kelln":
                    System.out.println("Germany");
                    break;
                /*case "Stop":
                    break;*/
                default:
                    System.out.println("Unknown country");
            }
        }
    }
}
