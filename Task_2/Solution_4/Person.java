package Task_2.Solution_4;
//1.4) Define a base class Person with attributes name and age.
//Create a subclass Employee that inherits from Person and adds attributes like employeeID and salary.
//Use the super keyword to initialize the Person attributes in the Employee constructor.
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
}
class Employee extends Person{
    int empID;
    double salary;
    Employee(String name,int age,int empID,double salary){
        super(name,age);
        this.empID=empID;
        this.salary=salary;
    }
}
//Output
//Regin
//22
//8
//45000.0
class Main{
    public static void main(String[] args) {
        Employee p1=new Employee("Regin",22,8,45000.00);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.empID);
        System.out.println(p1.salary);

    }
}