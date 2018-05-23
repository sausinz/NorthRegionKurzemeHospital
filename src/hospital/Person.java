/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author d302-debian
 */
public class Person {
    //Once person is created, only age can change
    private final String Name;
    private final String Surname;
    private short Age;
    private final int id;
            
    public Person(String Name, String Surname, short Age, int id)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.id = id;        
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getSurname()
    {
        return Surname;
    }        
    
    public int getId()
    {
        return id;
    }
     
    public short getAge()
    {
        return Age;
    }
    
    public void setAge(short Age)
    {
        this.Age = Age;
    }
}
