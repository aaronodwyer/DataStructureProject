/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ODwyerHospital;
import java.util.PriorityQueue;
import java.util.Comparator;

/**
 *
 * @author Aaron
 */
public class PatientPriorityQueue implements PatientPriorityQueueInterface<Patient> {
    private PriorityQueue<Patient> queue;

    public PatientPriorityQueue(){
        queue = new PriorityQueue<>((Patient p1, Patient p2) -> {
            // Compare priority (High > Medium > Low)
            if (p1.getPriority().equals("High") && !p2.getPriority().equals("High")) return -1;
            if (p2.getPriority().equals("High") && !p1.getPriority().equals("High")) return 1;
            if (p1.getPriority().equals("Medium") && p2.getPriority().equals("Low")) return -1;
            if (p2.getPriority().equals("Medium") && p1.getPriority().equals("Low")) return 1;
            
            // Compare by age (older patients come first)
            if (p1.getAge() > p2.getAge()) return -1;
            if (p1.getAge() < p2.getAge()) return 1;
            
            // Compare by hospital patient status (true = higher priority)
            if (p1.getCurrentPatient() && !p2.getCurrentPatient()) return -1;
            if (!p1.getCurrentPatient() && p2.getCurrentPatient()) return 1;
            
            return 0; // If all are equal, keep order
        });
    }

    @Override
    public void insert(Patient patient) {
        queue.add(patient);
    }

    @Override
    public Patient remove() {
        return queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void printQueue(){
        System.out.println("Priority Queue:");
        for(Patient p : queue){
            System.out.println(p);
        }
    }
}