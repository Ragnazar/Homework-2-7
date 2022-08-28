package pro.sky.homeworks.homework25;

import java.util.Objects;

public class Employee {
    //Поля
    private final String firstName;
    private final String lastName;

    //Конструктор
    public Employee(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Геттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //Сеттеры
   /* public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }*/

    //Остальные методы
    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " ";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLastName(), getFirstName());
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee c2 = (Employee) other;
        return Objects.equals(toString(), c2.toString());
    }
}
