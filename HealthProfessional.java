public class HealthProfessional {
    private int id;
    private String doctor;
    private String generalInfo;

    // Default constructor
    public HealthProfessional() {}

    // Constructor to initialize all instance variables
    public HealthProfessional(int id, String doctor, String generalInfo) {
        this.id = id;
        this.doctor = doctor;
        this.generalInfo = generalInfo;
    }

    public int getId() {
        return id;
    }
    public String getDoctor() {
        return doctor;
    }
    public String getGeneralInfo() {
        return generalInfo;
    }
    
    // Method to print all instance variables
    public void printDetails() {
        System.out.println("Doctor Name: " + doctor);
        System.out.println("ID: " + id);
        System.out.println("General Info: " + generalInfo);
    }
}