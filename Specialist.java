public class Specialist extends HealthProfessional {
    private String field;

    // Default constructor
    public Specialist() {}

    // Constructor to initialize all instance variables, including base class variables
    public Specialist(int id, String doctor, String generalInfo, String field) {
        super(id, doctor, generalInfo);
        this.field = field;
    }
    public String getField() {
        return field;
    }

    // Method to print details
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: Specialist");
        System.out.println("Field: " + field);
    }
}
