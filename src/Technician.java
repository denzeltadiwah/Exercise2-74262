// Technician.java
public class Technician extends Employee {
    public Technician(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void fixEquipment() {
        System.out.println("Technician is fixing something.");
    }
}