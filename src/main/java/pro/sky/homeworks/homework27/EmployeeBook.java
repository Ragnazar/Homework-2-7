package pro.sky.homeworks.homework27;

import java.util.Objects;

public class EmployeeBook {
    //Поля
    private final String firstName;
    private final String lastName;

    //Конструктор
    public EmployeeBook(String firstName, String lastName) {

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
        EmployeeBook c2 = (EmployeeBook) other;
        return Objects.equals(toString(), c2.toString());
    }
}
