/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ODwyerHospital;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.function.ToIntFunction;
/**
 *
 * @author Aaron
 */
public class PatientPriorityQueue implements PatientPriorityQueueInterface<Patient> {
    private PriorityQueue<Patient> queue;
    
    public PatientPriorityQueue(){
        queue = new PriorityQueue<>(Comparator
            .comparingInt((Patient p) -> {
                switch (p.getPriority()) {
                    case "High": return -1; // High = highest priority
                    case "Medium": return 0; // Medium = middle priority
                    case "Low": return 1; // Low = lowest priority
                    default: return 2;
                }
            })
            .thenComparingInt(p -> -p.getAge()) // Older patients first
            .thenComparingInt(p -> p.getIsCurrentPatient() ? -1 : 1) // Hospital patients first
        );
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