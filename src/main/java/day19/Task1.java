package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\dushi.txt";
        Scanner scanner = new Scanner(new File (path), "UTF-8");
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");

        List<String> text= new ArrayList<>();
            while (scanner.hasNext()) text.add(scanner.next());
        Map<String, Integer> textMap = new HashMap<>();
            for (String list: text) {
                if (textMap.keySet().contains(list)) {
                    textMap.put(list, textMap.get(list) + 1);
                }else textMap.put(list, 1);
            }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(textMap.entrySet());
            list.sort(new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    if (o1.getValue() > o2.getValue()) {
                        return -1;
                    } else if (o1.getValue() < o2.getValue()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            });
        int j = 1;
        for (Object entries: list) {
            if (j == 101) break;
            System.out.println(j+ "    " + entries);
            j++;
        }
        System.out.println("Слово Чичиков в тексте встречается " + textMap.get("Чичиков") + " раз");
    }
}
