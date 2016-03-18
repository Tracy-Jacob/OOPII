package FamilySaver;

/**
 * Created by jacobtracy on 2/29/16.
 */
public class Family {


    private int id;
    private String firstName,lastName;


    public Family(){

    }

    public Family(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Family Member{" + "id: " + id + ", firstName: " + firstName + ", lastName: " + lastName + '}';
    }

}
