package banksystem;

import java.util.ArrayList;
import java.util.List;

public class Bannk {


   private String title;
   private String address;
   private Director director;
   private List<Employee> employeeList = new ArrayList<>();


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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
