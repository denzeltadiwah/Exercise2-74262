// Manager.java
public class Manager extends Employee {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void holdMeeting() {
        System.out.println("Manager is holding a meeting.");
    }
}