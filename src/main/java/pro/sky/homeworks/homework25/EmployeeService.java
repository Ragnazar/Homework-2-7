package pro.sky.homeworks.homework25;

public interface EmployeeService {
    void setEmployee(String firstName, String lastName);

    void deleteEmployee(String firstName, String lastName);

    void getEmployee(String firstName, String lastName);

    String getEmployees();
}
