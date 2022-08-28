package pro.sky.homeworks.homework25;

import org.springframework.stereotype.Service;
import pro.sky.homeworks.homework25.exceptions.EmployeeAlreadyAddedException;
import pro.sky.homeworks.homework25.exceptions.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    public List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Ivan", "Ivanov"),
            new Employee("Ivan", "Sidorov")

    ));

    @Override
    public Employee setEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            employees.add(employee);
        } else {
            throw new EmployeeAlreadyAddedException("Работник уже есть в списке");
        }
        return employee;
    }

    @Override
    public Employee deleteEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            employees.remove(employee);
        } else {
            throw new EmployeeNotFoundException("Работник отсутствует");
        }
        return employee;
    }

    @Override
    public Employee getEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Работник отсутствует");
        }
        return employee;
    }

    @Override
    public Collection<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
}
