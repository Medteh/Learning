package day9.Task1;

public class Teacher extends Human {
    private String nameSubject;
    
    public Teacher (String name, String nameSubject) {
        super (name);
        this.nameSubject = nameSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This teacher has the name " + getName());
    }
}
