/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author d302-debian
 */
public class Appointment {
    private final int AppointmentID;
    private String Date;
    private ArrayList<Doctor> Doctors;
    private String Description;
    
    /**
     *
     * @param AppointmentID
     * @param Date
     * @param Doctors
     * @param Description
     */
    public Appointment(int AppointmentID, String Date, ArrayList<Doctor> Doctors, String Description){
        this.Date = Date;
        this.AppointmentID = AppointmentID;
        this.Doctors = Doctors;
        this.Description = Description;
    }
    
    public int getAppointmentID()
    {
        return AppointmentID;
    }   
    
    public String getDate()
    {
        return Date;
    }
    
    public void setDate(String Date)
    {
        this.Date = Date;
    }
    
    public String getDescription()
    {
        return Description;
    }
    
    public void setDescription(String Description)
    {
        this.Description = Description;
    }
    
    public void printInvolvedDoctors()
    {
       for(int i = 0; i < Doctors.size(); i++){
           Doctors.get(i);
       }
    }
    
    public void addNewDoctor(Doctor newDoctor)
    {
        Doctors.add(newDoctor);
    }
    
    public void removeExistingDoctor(int id)
    {
        Doctors.remove(id);
    }
}
