public class GeneralPractitioner extends HealthProfessional {
    private String specializationArea;

    // Default constructor
    public GeneralPractitioner() {}

    // Constructor to initialize all instance variables, including base class variables
    public GeneralPractitioner(int id, String doctor, String generalInfo, String specializationArea) {
        super(id, doctor, generalInfo);
        this.specializationArea = specializationArea;
    }
    public String getSpecializationArea() {
        return specializationArea;
    }
    // Method to print details
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Specialization Area: " + specializationArea);
    }
}
