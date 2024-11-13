import java.util.ArrayList;

public class AppointmentSystem {
    private final ArrayList<Appointment> appointments = new ArrayList<>();

    // Method to create a new appointment
    public void createAppointment(String patientName, String patientMobile, String timeSlot, HealthProfessional professional) {
        Appointment appointment = new Appointment(patientName, patientMobile, timeSlot, professional);
        appointments.add(appointment);
        System.out.println("Appointment created successfully.");
    }

    // Method to print all appointments
    public void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // Method to cancel an appointment by patient mobile number
    public void cancelBooking(String mobile) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(mobile)) {
                appointments.remove(appointment);
                System.out.println("Appointment cancelled.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found for the provided mobile number.");
        }
    }
}