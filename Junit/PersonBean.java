package jacob.tracy.Junit;

import java.io.Serializable;

/**
 * Created by jacobtracy on 11/20/15.
 */
public class PersonBean implements Serializable {

    private String firstName;
    private String lastName;
    private int age;

    public PersonBean(String name, String last, int age) {
        this.firstName = name;
        this.lastName = last;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }





}
