package services;

import employee.EmployeeType;
import employee.Employees;
import interfaces.ServicesInterface;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;

import static employee.EmployeeType.MANAGER;

/**
 * Created by Александр on 26.04.2017.
 */
public class XMLService implements ServicesInterface{

    private static XMLService instance;

    Document doc;
    File file;

    public XMLService()  {
    }
    private void createDoc(){

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            try {
                doc = factory.newDocumentBuilder().newDocument();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            }

    }
    private void createFile() {
        if(!file.exists()) {
            file = new File("D:\\Project\\consoleEmploeeList\\src\\main\\resources\\EmployeeList.xml");
        }
        Transformer transformer = null;
        try
        {
            transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(new DOMSource(doc), new StreamResult(file));
        }
        catch (TransformerConfigurationException e)
        {
            e.printStackTrace();
        }
        catch (TransformerException e)
        {
            e.printStackTrace();
        }
    }

    public void addEmployee(Employees emp){

            createDoc();

            Element employees = doc.createElement("employees");
            doc.appendChild(employees);

            Element employee = doc.createElement("employee");
            employee.setAttribute("id", String.valueOf(Employees.getId()));
            employees.appendChild(employee);

            Element employeeName = doc.createElement("name");
            employee.appendChild(employeeName);
            employeeName.setTextContent(emp.getName());


             Element employeeBithDate = doc.createElement("bith-date");
        employeeBithDate.setTextContent(String.valueOf(emp.getBithDate()));

        employee.appendChild(employeeBithDate);


        Element employeeStartDate = doc.createElement("start-date");
        employeeStartDate.setTextContent(String.valueOf(emp.getStartWorkDate()));
            employee.appendChild(employeeStartDate);
            switch (emp.getType()){
                case MANAGER:
                    Element employeesList = doc.createElement("employee-list");
                    employee.appendChild(employeesList);

                    Element employeesId = doc.createElement("employee-id");
                    employeesList.appendChild(employeesId);
                    break;
                case OTHERS:
                    Element description = doc.createElement("employee-list");
                    employee.appendChild(description);
                    break;
                default:
                    break;

            }
            createFile();
        }

//    public XMLService getInstance() {
//        if (instance == null){
//            instance =  new XMLService();
//        }
//        return instance;
//    }
    public Document readXML(File file){

        return doc;
    }
}




