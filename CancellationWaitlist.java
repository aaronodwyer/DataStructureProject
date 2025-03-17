/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ODwyerHospital;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Aaron
 */
public class CancellationWaitlist implements PatientQueueInterface<Patient> {
    private Queue<Patient> queue;

    public CancellationWaitlist() {
        queue = new LinkedList<>();
    }

    @Override
    public void enqueue(Patient patient) {
        queue.add(patient);
    }

    @Override
    public Patient dequeue() {
        return queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void printQueue() {
        System.out.println("Cancellation Waitlist:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    } 
    
}
