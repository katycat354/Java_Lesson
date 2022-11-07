package banksystem;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    String firstName;
    String lastName;
    int salary;


    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void printInformation(){
        System.out.println(firstName + " - " + lastName + " - " + salary + " - ");
    }

}
