// Main.java
public class Main {
    public static void main(String[] args) {
        Employee secretary = new Secretary("Denzel", 101, 50000);
        Employee technician = new Technician("Tadiwa", 102, 60000);
        Employee manager = new Manager("Tariro", 103, 80000);

        secretary.displayInfo();
        ((Secretary) secretary).takeNotes();

        technician.displayInfo();
        ((Technician) technician).fixEquipment();

        manager.displayInfo();
        ((Manager) manager).holdMeeting();
    }
}