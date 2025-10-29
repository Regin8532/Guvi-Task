package Task_2.Solution_1;

import java.util.Scanner;
//1.1) Create a class Person with properties (name and age) with following features.
//a. Default age of person should be 18;
//b. A person object can be initialized with name and age;
//c. Method to display name and age of person
public class Person {
    String name;
    int age;
    Person(String name){
        this.name=name;
        this.age=18;
        this.display();
    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
        this.display();
    }
    void display(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}
//Output:
//Name:Regin
//Age:22
//Name:Regin
//Age:18
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            Person p1 = new Person("Regin", 22);
            Person p2 = new Person("Regin");
    }
}