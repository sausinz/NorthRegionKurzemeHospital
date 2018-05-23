/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.*;

/**
 *
 * @author d302-debian
 */
public class Patient extends Person{
    
    ArrayList<Appointment> Appointments;
    
    public Patient(String Name, String Surname, short Age, int id, ArrayList<Appointment> list)
    {
        super(Name,Surname,Age, id);
        this.Appointments = list;
    }
    
    public void printAllAppointments()
    {
        for (int i = 0; i < Appointments.size(); i++){
            Appointments.get(i);
            System.out.println("ID: " + getId());
        } 
        //[ID, Date, Office Num, Description]
        //Involved Doctor 1
        //Involved Doctor 2
        //...
        //Involved Doctor N
        
        //[ID, Date, Office Num, Description]
        //Involved Doctor 1
        //Involved Doctor 2
        //...
        //Involved Doctor N
        
        //etc
    }
    
    public void subscribeNewAppointment(Appointment newAppointment)
    {
        Appointments.add(newAppointment);
    }
    
    public void deleteExistingAppointment(int AppointmentID)
    {
        Appointments.remove(AppointmentID);
    }
    
    public ArrayList<Appointment> getAppointmentList()
    {
        return Appointments;
    }
}
