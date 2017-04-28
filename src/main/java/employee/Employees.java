package employee;

import interfaces.RecordInterface;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Александр on 26.04.2017.
 */
public abstract class Employees implements RecordInterface {

    static int id = 0;
    String name;
    String bithDate;
    String startWorkDate;
    EmployeeType type;
    static List<Employees> employeesList = new ArrayList<Employees>();


    public Employees() {
        employeesList.add(this);
        id += 1;


    }
    public Employees(String name, String bithDate, String startWorkDate, EmployeeType type) {
        this.name = name;
        this.bithDate = bithDate;
        this.startWorkDate = startWorkDate;
        this.type = type;

        employeesList.add(this);
        id += 1;
    }


    public void addRecord() {

    }
    public void updateRcord(String name, EmployeeType type){

    }
    public void deleteRecord(String name) {

    }


    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Employees.id = id;
    }
    public static List<Employees> getEmployeesList() {
        return employeesList;
    }
    public static void setEmployeesList(List<Employees> employeesList) {
        Employees.employeesList = employeesList;
    }


    public String getName() {
        return name;
    }
    public String getBithDate() {
        return bithDate;
    }
    public String getStartWorkDate() {
        return startWorkDate;
    }
    public EmployeeType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", bithDate=" + bithDate +
                ", startWorkDate=" + startWorkDate +
                ", type=" + type +
                '}';
    }
}
