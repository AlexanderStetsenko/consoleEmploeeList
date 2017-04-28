package employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Александр on 26.04.2017.
 */
public class Employee extends Employees {

    public Employee(String name, String bithDate, String startWorkDate, EmployeeType type)
    {
        super(name, bithDate, startWorkDate, type);
    }

    public Employee() {
        super();
    }

    public void addEmployee(File file) throws IOException {

        Employee emp = null;
        FileReader fileReader = new FileReader("Ivanov.txt");

    }
}
