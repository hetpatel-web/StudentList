
package studentlist;

/**
 *
 * @author Het
 */

public class Student {
    private String sID;
    private String sName;
//     this has been edited on github.com to show push and pull Magic!!
    public Student(String sID, String sName) {
        this.sID = sID;
        this.sName = sName;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

}
