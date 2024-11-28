// Employee.java
public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee: " + name + " (ID: " + id + ", Salary: $" + salary + ")");
    }
}