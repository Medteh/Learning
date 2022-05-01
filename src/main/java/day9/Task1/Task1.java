package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Human human1 = new Human("Petr");
        human1.printInfo();
        System.out.println();

        Student student1 = new Student("Vladislav", "A521");
        System.out.println(student1.getGroupName());
        student1.printInfo();
        System.out.println();

        Teacher teacher1 = new Teacher( "Leonid Arkadievich ", "Programmirovanie");
        System.out.println(teacher1.getNameSubject());
        teacher1.printInfo();
    }
}
