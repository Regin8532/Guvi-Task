package Task_3.Solution_2;

import java.util.Scanner;
//2.Create Interface Taxable with members sales Tax-7% and income Tax-10.5%, create abstract method calcTax().
//a. Create class Employee(empId,name,salary) and implement Taxable to calculate income Tax on yearly salary.
//b. Create class Product(pid.price, quantity) and implement Taxable to calculate sales Tax on unit price of product.
//c. Create class for main method(Say DriverMain), accept employee information and a product information from user and print income tax and sales tax respectively
public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // To check income tax for the employee
        System.out.println("Enter Employee ID, Name, and Monthly Salary:");
        int empID = sc.nextInt();
        String name = sc.next();
        double salary = sc.nextDouble();
        Employee employee = new Employee(empID, name, salary);
        employee.calcTax();

        // To check sales tax for the product
        System.out.println("Enter Product ID, Price, and Quantity:");
        int pID = sc.nextInt();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        Product product = new Product(pID, price, quantity);
        product.calcTax();
    }
}
//Output:
//Enter Employee ID, Name, and Monthly Salary:
//1
//Regin
//56000.00
//Income Tax for Regin: 70560.0
//Enter Product ID, Price, and Quantity:
//1
//72.00
//2
//Sales Tax on one unit: 5.040000000000001