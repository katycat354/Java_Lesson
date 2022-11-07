package cargo;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    String title;
    String address;
    List<Employee> employeeList = new ArrayList();
    List<Cargo> cargoList = new ArrayList();

    public Storage (String title, String address){
        this.title = title;
        this.address = address;
    }

    public void addEmployee(String firstName, String lastName, int salary) {
        Employee employee = new Employee(firstName, lastName, salary);
        this.employeeList.add(employee);
    }

    public void addCargo(String cargoName, String weight, String pointOfDeparture, String pointOfDestination) {
        Cargo cargo = new Cargo (cargoName, weight, pointOfDeparture, pointOfDestination);
        this.cargoList.add(cargo);
    }


}
