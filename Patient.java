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
    public boolean isCurrentPatient;// True if currently in the hospital
    
    public Patient(String name, String priority, String gpDetails, int age, boolean isCurrentPatient){
        this.name= name;
        this.priority= priority;
        this.gpDetails= gpDetails;
        this.age= age;
        this.isCurrentPatient= isCurrentPatient;  
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
    
    public boolean getIsCurrentPatient(){
        return isCurrentPatient;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return name + " (" + priority + ", Age: " + age + ", Current Patient: " + isCurrentPatient + ")";
    }
}
