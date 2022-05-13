package day12.task2;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();
        fillingEvenNumbers(0, 30, evenNumbers);
        fillingEvenNumbers(300, 350, evenNumbers);
        System.out.println(evenNumbers);
    }

    public static List<Integer> fillingEvenNumbers( int from, int to, List<Integer> list) {
        for (int i = from; i <= to; i++) {
            if (i % 2 ==0) list.add(i);
        }
        return list;
    }
}
