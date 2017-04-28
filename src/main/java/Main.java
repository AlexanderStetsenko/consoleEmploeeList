import employee.*;
import services.FileService;
import services.XMLService;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

/**
 * Created by Александр on 26.04.2017.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException, TransformerException {

        FileService fileService = new FileService();
        fileService.getEmployee(new File("D:\\Project\\consoleEmploeeList\\src\\main\\resources\\Ivanov.txt"));
        XMLService xmlService = new XMLService();

        xmlService.addEmployee(new Employee("ivan", "12.12.12", "12.12.12", EmployeeType.EMPLOYEE));
    }
}
