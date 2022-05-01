package day9.Task1;

public class Student extends Human{
    private String groupName;

    public Student (String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo() {
        System.out.println("This human has the name " + getName());
        System.out.println("This student has the name " + getName());
    }
}
