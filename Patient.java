/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ODwyerHospital;

/**
 *
 * @author Aaron
 */
//This class will store patient details
public class Patient {
    private String name;
    private String priority; // This will be how patients are called upon dpending on priority level:Low, Medium, High
    private String gpDetails;
    private int age;
    private boolean currentPatient;// True if currently in the hospital
    
    public Patient(String name, String Priority, String gpDetails, int age, boolean currentPatient){
        this.name= name;
        this.priority= priority;
        this.gpDetails= gpDetails;
        this.age= age;
        this.currentPatient= currentPatient;  
    }
    
    public String getName(){
        return name;
    }
    
    public String getPriority(){
        return priority;
    }
    
    public String getGpDetails(){
        return gpDetails;
    }
    
    public int getAge(){
        return age;
    }
    
    public boolean currentPaient(){
        return currentPatient;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return name + " (" + priority + ", Age: " + age + ", Current Patient: " +currentPatient + ")";
    }
}
