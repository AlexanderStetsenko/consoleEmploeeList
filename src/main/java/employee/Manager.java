package employee;

import services.FileService;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * Created by Александр on 26.04.2017.
 */
public class Manager extends Employees {

    List<Employee> employeeList;

    public Manager(String name, String bithDate, String startWorkDate, EmployeeType type, List<Employee> employeeList) {
        super(name, bithDate, startWorkDate, type);
        this.employeeList = employeeList;
    }
    public Manager() {
        super();
    }


    @Override
    public String toString() {
        return super.toString() + "Manager{" +
                "employeeList=" + employeeList +
                '}';
    }

    public void addEmployee(File file) {
        FileService fileService = new FileService();
       //Employees emp = fileService.getEmployeeData(file);
    }
}
