package day8;

public class Task1 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        long stop = System.currentTimeMillis();
        long difference = stop - start;
        System.out.println("Time length:" + difference);
        System.out.println(sb);

        start = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i <= 20000; i++) {
            string = string + i + " ";
        }
        stop = System.currentTimeMillis();
        difference = stop - start;
        System.out.println("Time length:" + difference);
        System.out.println(string);
    }
}

