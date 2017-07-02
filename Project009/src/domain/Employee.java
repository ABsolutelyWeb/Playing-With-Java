package domain;

public class Employee {
    private long id;
    private String name;
    private String dept;
    private boolean workStatus;

    public Employee(long id, String name, String dept, boolean workStatus) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.workStatus = workStatus;
    }

    public void about() {
        System.out.println("Hello, my name is " + name + " and my ID number is " + id + ". I am from the " + dept + " department and my work status is " + workStatus + ".");
    }
}
