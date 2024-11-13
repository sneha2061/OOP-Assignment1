public class GeneralPractitioner extends HealthProfessional {
    private String specializationArea;

    // Default constructor
    public GeneralPractitioner() {}

    // Constructor to initialize all instance variables, including base class variables
    public GeneralPractitioner(int id, String name, String generalInfo, String specializationArea) {
        super(id, name, generalInfo);
        this.specializationArea = specializationArea;
    }

    // Method to print details
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Specialization Area: " + specializationArea);
    }
}
