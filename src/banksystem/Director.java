package banksystem;

public class Director {

    String firstName;
    String lastName;
    int salary;

    public Director (String firstName, String lastName, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void printInformation(){
        System.out.println(firstName + " - " + lastName + " - " + salary + " - ");
    }

    /*
    Сделать конструктор
    и
    сделаь метод, который бы печатал информацию о директоре на экран. Аналогично как в банке

    Но не делать тут главный метод.
     */
}
