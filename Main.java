/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ODwyerHospital;
import javax.swing.SwingUtilities;
/**
 *
 * @author Aaron
 */
    public class Main {
    public static void main(String[] args) {
        BloodTestScheduler scheduler = new BloodTestScheduler();
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PatientGUI(); // Start the GUI
            }
        });
        // Adding sample patients
        scheduler.schedulePatient(new Patient("Alice", "Urgent", "Dr. Smith", 70, true));
        scheduler.schedulePatient(new Patient("Bob", "Medium", "Dr. Adams", 50, false));
        scheduler.schedulePatient(new Patient("Charlie", "Low", "Dr. Brown", 30, false));

        // Handling no-shows
        scheduler.addNoShow(new Patient("David", "Medium", "Dr. Lee", 40, false));
        scheduler.addNoShow(new Patient("Eve", "Urgent", "Dr. Taylor", 65, true));

        // Handling cancellations
        scheduler.addToCancellationWaitlist(new Patient("Frank", "Low", "Dr. Miller", 45, false));

        // Print all queues
        scheduler.printAllQueues();

        // Get next patient
        System.out.println("Next patient: " + scheduler.getNextPatient());
    }
}

