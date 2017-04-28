package services;

import employee.Employee;
import employee.Employees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Александр on 26.04.2017.
 */
public class FileService {

    private String getEmployeeData(File file) throws FileNotFoundException {
        String empData = "";

        Scanner in = new Scanner(new File("D:\\Project\\consoleEmploeeList\\src\\main\\resources\\Ivanov.txt"));
        while(in.hasNext())
            empData += in.nextLine() + "\r\n";
        in.close();

        System.out.println(empData);
        //read Employee data from File

        return empData;
    }

    public Employees getEmployee(File file) throws FileNotFoundException {

        Employees employee = null;
        getEmployeeData(file);
        String employeeType = "";
        switch (employeeType)
        {
            case "Employee":
//                employee = new Employee();
                break;
            case "Manager":

                break;
            case "Other":

                break;
            default:
                System.out.println("Employee Type is absent");
                break;
        }




        return employee;
    }
}
