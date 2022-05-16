package day14;

import java.io.File;
import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args)  {
        try {
            System.out.println(Human.parseFileToObjList(new File("people")));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
