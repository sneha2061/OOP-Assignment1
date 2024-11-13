// HealthProfessional.java
public class HealthProfessional {
    private int id;
    private String name;
    private String generalInfo;

    // Default constructor
    public HealthProfessional() {}

    // Constructor to initialize all instance variables
    public HealthProfessional(int id, String name, String generalInfo) {
        this.id = id;
        this.name = name;
        this.generalInfo = generalInfo;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("General Info: " + generalInfo);
    }
}