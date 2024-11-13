public class Specialist extends HealthProfessional {
    private String field;

    // Default constructor
    public Specialist() {}

    // Constructor to initialize all instance variables, including base class variables
    public Specialist(int id, String name, String generalInfo, String field) {
        super(id, name, generalInfo);
        this.field = field;
    }

    // Method to print details
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: Specialist");
        System.out.println("Field: " + field);
    }
}
