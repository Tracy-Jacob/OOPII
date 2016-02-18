package jacob.tracy.Junit;

/**
 * Created by jacobtracy on 11/20/15.
 */
public class employeBean extends PersonBean {

    private String department;
    private String Enumber;



    public employeBean(String name, String last, int age, String department, String Enumber){
        super(name,last,age);
        this.department = department;
        this.Enumber = Enumber;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEnumber() {
        return Enumber;
    }
    public void setEnumber(String enumber) {
        Enumber = enumber;
    }

}
