package pro.sky.homeworks.homework25;

import org.springframework.stereotype.Service;
import pro.sky.homeworks.homework25.exceptions.EmployeeAlreadyAddedException;
import pro.sky.homeworks.homework25.exceptions.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    public List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Ivan", "Ivanov"),
            new Employee("Ivan", "Sidorov")

    ));

    public String setEmployee(String firstName, String lastName) {
        Employee e = new Employee(firstName, lastName);
        if (!employees.contains(e)) {
            employees.add(e);
        } else {
            throw new EmployeeAlreadyAddedException("Работник уже есть в списке");
        }
        return e.toString();
    }


    public String deleteEmployee(String firstName, String lastName) {
        Employee e = new Employee(firstName, lastName);
        if (employees.contains(e)) {
            employees.remove(e);
        } else {
            throw new EmployeeNotFoundException("Работник отсутствует");
        }
        return e.toString();
    }


    public String getEmployee(String firstName, String lastName) {
        Employee e = new Employee(firstName, lastName);
        if (!employees.contains(e)) {
            throw new EmployeeNotFoundException("Работник отсутствует");
        }
        return e.toString();
    }

    public String getEmployees() {
        return employees.toString();
    }
}
