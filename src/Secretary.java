// Secretary.java
public class Secretary extends Employee {
    public Secretary(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void takeNotes() {
        System.out.println("Secretary is taking notes.");
    }
}