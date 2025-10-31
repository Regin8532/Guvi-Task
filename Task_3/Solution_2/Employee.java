package Task_3.Solution_2;

class Employee implements Taxable {
    int empID;
    String name;
    double salary;

    Employee(int empID,String name,double salary) {
        this.empID =empID;
        this.name = name;
        this.salary =salary;
    }

    public void calcTax() {
        double tax = salary*12*incomeTax;
        System.out.println("Income Tax for "+name+": "+tax);
    }
}