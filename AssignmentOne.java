public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Sneha", "Experienced GP", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Leila", "5 years of experience", "Pediatrics");
        Specialist specialist1 = new Specialist(4, "Dr. Brianna", "Expert in Cardiology", "Cardiology");
        System.out.println("Health Professionals:");
        gp1.printDetails();
        gp2.printDetails();
        specialist1.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        AppointmentSystem system = new AppointmentSystem();
        system.createAppointment("Aashma", "1234567890", "08:00", gp1);
        system.createAppointment("Bibhushan", "1244567790", "09:00", gp1);
        system.createAppointment("Binod", "0487664320", "10:00", gp2);
        system.createAppointment("Charishma", "0401130456", "14:30", specialist1);
        system.createAppointment("Bandana", "0401100556", "12:30", specialist1);
       
        System.out.println("All Appointments:");
        system.printExistingAppointments();
        
        // Cancel one appointment
        system.cancelBooking("0487664320");

        System.out.println("Updated Appointments:");
        system.printExistingAppointments();

        System.out.println("------------------------------");
    }
}
