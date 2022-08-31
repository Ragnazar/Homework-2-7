package pro.sky.homeworks.homework27;

import org.springframework.stereotype.Service;
import pro.sky.homeworks.homework27.exceptions.EmployeeAlreadyAddedException;
import pro.sky.homeworks.homework27.exceptions.EmployeeNotFoundException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    public HashMap<EmployeeBook, Integer> employees = new HashMap<>(Map.of(
            new EmployeeBook("Ivan", "Ivanov"), 0,
            new EmployeeBook("Ivan", "Sidorov"), 1)
    );

    @Override
    public EmployeeBook setEmployee(String firstName, String lastName) {
        EmployeeBook employee = new EmployeeBook(firstName, lastName);
        if (!employees.containsKey(employee)) {
            employees.put(employee,employees.size());
        } else {
            throw new EmployeeAlreadyAddedException("Работник уже есть в списке");
        }
        return employee;
    }

    @Override
    public EmployeeBook deleteEmployee(String firstName, String lastName) {
        EmployeeBook employee = new EmployeeBook(firstName, lastName);
        if (employees.containsKey(employee)) {
            employees.remove(employee);
        } else {
            throw new EmployeeNotFoundException("Работник отсутствует");
        }
        return employee;
    }

    @Override
    public EmployeeBook getEmployee(String firstName, String lastName) {
        EmployeeBook employee = new EmployeeBook(firstName, lastName);
        if (!employees.containsKey(employee)) {
            throw new EmployeeNotFoundException("Работник отсутствует");
        }
        return employee;
    }

    @Override
    public Collection<EmployeeBook> getEmployees() {
        return (Collection<EmployeeBook>) employees;
    }
}
