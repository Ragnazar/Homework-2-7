package pro.sky.homeworks.homework27;

import java.util.Collection;

public interface EmployeeService {
    EmployeeBook setEmployee(String firstName, String lastName);

    EmployeeBook deleteEmployee(String firstName, String lastName);

    EmployeeBook getEmployee(String firstName, String lastName);

    Collection<EmployeeBook> getEmployees();
}
