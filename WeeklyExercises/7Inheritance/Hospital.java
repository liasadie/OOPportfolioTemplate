class Employee {
    protected final int employeeId;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }
    public int getEmployeeId() {
        return employeeId;
    }
}

class Doctor extends Employee{

    public Doctor(int employeeId) {
        super(employeeId);
    }

    public void treatPatient() {
        System.out.println("Doctor" + employeeId + " is treating a patient.");
    }

    public void neurologySpecialism() {
        System.out.println("Doctor" + employeeId + " specialises in neurology.");
    }
}

class Nurse extends Employee{

    public Nurse(int employeeId) {
        super(employeeId);
    }

    public void takeVitalSigns() {
        System.out.println("Nurse" + employeeId + " has patients.");
    }

    public void changingBeds() {
        System.out.println("Nurse" + employeeId + " is making beds up.");
    }
}

class Receptionist extends Employee{

    public Receptionist(int employeeId) {
        super(employeeId);
    }

    public void assistPatients() {
        System.out.println("Receptionist" + employeeId + " is assisting patients.");
    }

    public void scheduleAppointments() {
        System.out.println("Receptionist" + employeeId + " is scheduling appointments.");
    }
}

class Cleaner extends Employee{

    public Cleaner(int employeeId) {
        super(employeeId);
    }

    public void sweep() {
        System.out.println("Cleaner" + employeeId + " is sweeping.");
    }

    public void sanitize() {
        System.out.println("Cleaner" + employeeId + " is sanitizing the rooms.");
    }
}

public class Hospital {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(101);
        Nurse nurse = new Nurse(201);
        Receptionist receptionist = new Receptionist(301);
        Cleaner cleaner = new Cleaner(401);

        doctor.treatPatient();
        doctor.neurologySpecialism();

        nurse.takeVitalSigns();
        nurse.changingBeds();

        receptionist.assistPatients();
        receptionist.scheduleAppointments();

        cleaner.sweep();
        cleaner.sanitize();
    }
}