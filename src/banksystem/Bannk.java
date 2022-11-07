package banksystem;

import java.util.ArrayList;
import java.util.List;

public class Bannk {


    String title;
    String address;
    Director director;
    List<Employee> employeeList = new ArrayList<>();


    public Bannk(String title, String address, Director director){
        this.title = title;
        this.address = address;
        this.director = director;
    }

    public void addEmployee(String firstName, String lastName, int salary) {
       Employee  employee = new Employee(firstName, lastName, salary);
        employeeList.add(employee);
    }

    public void printEmployee(){
        for (int i = 0; i < employeeList.size(); i++){
            Employee employee = employeeList.get(i);
            employee.printInformation();
        }
    }
    public void printInformation(){
        System.out.println(title + " - " + address);
    }

    public void whoIsDirector()  {
            director.printInformation();

    }

    public static void main(String[] args) {

        Director director = new Director("Alex", "A", 1_000_000);
        Bannk alphaBank = new Bannk("Alpha Bank", "Spb. nevskiy 55", director);
        alphaBank.printInformation();
        alphaBank.whoIsDirector();
        alphaBank.addEmployee("Anja", "L", 60_0000);
        alphaBank.addEmployee("Kolja", "L", 60_0000);
        alphaBank.printEmployee();
        Bannk vtbBank = new Bannk("Vtb Bank", "Spb. Nevskiy 33", director);
        vtbBank.printInformation();

    }
}
