package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher ("P.Eins", "Mathetimatiks");
        Student student = new Student("Fedor");
        student.setName("Rois");

        teacher.evaluate (student);
    }
}

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate (Student student) {
        Random random = new Random();
        int rand = random.nextInt(4)+2;
        String mark = new String();
        switch (rand) {
            case 2: mark = "bad";
            break;
            case 3: mark = "not bad";
            break;
            case 4: mark = "good";
            break;
            case 5: mark = "excellent";
            break;
        }
        System.out.println("Teacher "+ name +" evaluate student " + student.getName() + " on subject " + subject + " mark " + mark);
    }
}
    class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}