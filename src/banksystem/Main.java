package banksystem;

public class Main {


    public static void main(String[] args) {

        Director director = new Director("Alex", "A", 1_000_000);
        director.setSalary(-3_000_000);
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
