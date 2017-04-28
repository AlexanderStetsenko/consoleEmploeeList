package interfaces;

import employee.EmployeeType;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Александр on 26.04.2017.
 */
public interface RecordInterface {
    void addRecord();
    void updateRcord(String name, EmployeeType type);
    void deleteRecord(String name);
}
