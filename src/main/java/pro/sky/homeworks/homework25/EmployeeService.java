package pro.sky.homeworks.homework25;

public interface EmployeeService {
    String setEmployee(String firstName, String lastName);

    String deleteEmployee(String firstName, String lastName);

    String getEmployee(String firstName, String lastName);

    String getEmployees();
}
