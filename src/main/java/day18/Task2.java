package day18;

public class Task2 {
    private static int i = 0;

    public static int count7(long number) {
        if (number%10 == 7 || number == 7) i++;
        if (number < 10) return i;
        count7(number/10);
        return i;
    }
    public static void main(String[] args) {
        long number = -87780006582356777L;
        System.out.println("В числе " + number + " ровно " + count7(Math.abs(number)) + " раз используется число 7");
    }
}
