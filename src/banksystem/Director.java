package banksystem;

public class Director {

   private String firstName;
   private String lastName;
   private int salary;

    public Director (String firstName, String lastName, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void printInformation(){
        System.out.println(firstName + " - " + lastName + " - " + salary + " - ");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;

        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }
/*
    Сделать конструктор
    и
    сделаь метод, который бы печатал информацию о директоре на экран. Аналогично как в банке

    Но не делать тут главный метод.
     */
}
