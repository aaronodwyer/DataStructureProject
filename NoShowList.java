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
public class NoShowList implements PatientQueueInterface<Patient> {
    private LinkedList<Patient> queue;
    
    public NoShowList(){
        queue = new LinkedList<>();
    }
    
    @Override
    public void enqueue(Patient patient){
        if(queue.size() >=5){
            queue.removeFirst();
        }
        queue.add(patient);
    }
    
    /**
     *
     * @return
     */
    @Override
    public Patient dequeue(){
        return queue.poll();
    }
    
    @Override
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public void printQueue(){
        System.out.println("No Show List:");
        for(Patient p: queue){
            System.out.println(p);
        }
    }
}
