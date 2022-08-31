package pro.sky.homeworks.homework25;

import java.util.Collection;

public interface EmployeeService {
    Employee setEmployee(String firstName, String lastName);

    Employee deleteEmployee(String firstName, String lastName);

    Employee getEmployee(String firstName, String lastName);

    Collection<Employee> getEmployees();
}
