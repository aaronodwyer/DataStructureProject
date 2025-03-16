/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ODwyerHospital;

/**
 *
 * @author Aaron
 */
public class BloodTestScheduler implements Schedulable {
    private PatientPriorityQueue priorityQueue;
    private NoShowList noShowList;
    private CancellationWaitlist cancellationWaitlist;

    public BloodTestScheduler() {
        priorityQueue = new PatientPriorityQueue();
        noShowList = new NoShowList();
        cancellationWaitlist = new CancellationWaitlist();
    }

    @Override
    public void schedulePatient(Patient patient) {
        priorityQueue.insert(patient);
    }

    @Override
    public Patient getNextPatient() {
        return priorityQueue.remove();
    }

    public void addNoShow(Patient patient) {
        noShowList.enqueue(patient);
    }

    public void addToCancellationWaitlist(Patient patient) {
        cancellationWaitlist.enqueue(patient);
    }

    public void printAllQueues() {
        priorityQueue.printQueue();
        noShowList.printQueue();
        cancellationWaitlist.printQueue();
    }
} 
    

