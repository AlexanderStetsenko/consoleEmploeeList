package employee;

import java.io.File;
import java.util.Date;

/**
 * Created by Александр on 26.04.2017.
 */
public class OtherEmployee extends Employees{

    String decriptionPosition;

    public OtherEmployee(String name, String bithDate, String startWorkDate, EmployeeType type) {
        super(name, bithDate, startWorkDate, type);
    }

    public OtherEmployee(String name, String bithDate, String startWorkDate, EmployeeType type, String decriptionPosition) {
        super(name, bithDate, startWorkDate, type);
        this.decriptionPosition = decriptionPosition;
    }

    public OtherEmployee() {
        super();
    }

    @Override
    public String toString() {
        return "OtherEmployee{" +
                "decriptionPosition='" + decriptionPosition + '\'' +
                '}';
    }

    public void addEmployee(File file) {

    }
}
