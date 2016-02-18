package jacob.tracy.Junit;

/**
 * Created by jacobtracy on 11/20/15.
 */
public class inmateBean extends PersonBean {
    private String cellBlock;
    private String Inumber;
    private String threatProbability;

    public inmateBean(String name, String last, int age, String cellBlock, String Inumber, String threatProbability){
        super(name, last, age);
        this.cellBlock = cellBlock;
        this.Inumber = Inumber;
        this.threatProbability = threatProbability;
    }
    public String getCellBlock() {
        return cellBlock;
    }
    public void setCellBlock(String cellBlock) {
        this.cellBlock = cellBlock;
    }
    public String getInumber() {
        return Inumber;
    }
    public void setInumber(String inumber) {
        Inumber = inumber;
    }
    public String getThreatProbability() {
        return threatProbability;
    }
    public void setThreatProbability(String threatProbability) {
        this.threatProbability = threatProbability;
    }
}
