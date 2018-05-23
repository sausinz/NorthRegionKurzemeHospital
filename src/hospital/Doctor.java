/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author d302-debian
 */
public class Doctor extends Person {
    private final short OfficeNum;
    private final String Speciality;
    
    public Doctor(String Name, String Surname, short Age, int id, short OfficeNum, String Speciality)
    {
        super(Name,Surname,Age, id);
        this.OfficeNum = OfficeNum;
        this.Speciality = Speciality;        
    }
    
    public short getOfficeNum()
    {
        return OfficeNum;
    }
    
    public String getSpeciality()
    {
        return Speciality;
    }
}
