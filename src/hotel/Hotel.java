package hotel;

import banksystem.Director;
import banksystem.Employee;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    List<Employee> employeeList = new ArrayList<>();

    public Hotel(){

    }
    public void addEmployee(String firstName, String lastName, int salary) {
        Employee  employee = new Employee(firstName, lastName, salary);
        employeeList.add(employee);
    }

}

