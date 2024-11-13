public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional healthProfessional;

    // Default constructor
    public Appointment() {}

    // Constructor to initialize all instance variables
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.healthProfessional = healthProfessional;
    }

    // Method to print appointment details
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        healthProfessional.printDetails();
    }

    public String getPatientMobile() {
        return patientMobile;
    }
}

