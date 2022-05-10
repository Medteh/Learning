package day12.task2;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= 350; i++) {
            if ((i % 2 == 0 && i <= 30) || (i % 2 == 0 && i >= 300))
                evenNumbers.add(i);
        }
        System.out.println(evenNumbers);

    }
}
