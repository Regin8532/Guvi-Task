package Task_4;

import java.util.Scanner;
import java.util.regex.Pattern;
//Q1. Ramesh is developing a student management system for a university. In this system, you have a Student class to represent student information. You are asked to help Ramesh to handle exception which can be occurred into program according to following Scenarios:
//class Student with attributes roll no, name, age and course. Initialize values through parameterized constructors.
//If the age of the student is not between 15 and 21 then generate a user-defined exception "AgeNotWithinRangeException".
//If a name contains numbers or special symbols, raise exception "NameNot ValidException". Define the two exception classes.
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll no.:");
        int rollNo= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        String name= sc.nextLine();
        System.out.println("Enter Age:");
        int age= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Course:");
        String course= sc.nextLine();
        try {
            Student stud = new Student(rollNo, name, age,course);
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }catch(NameNotValidException e){
            System.out.println(e.getMessage());
        }
    }
}
class Student{
    int rollNo;
    String name;
    int age;
    String course;
    Student(int rollNo,String name,int age,String course) throws AgeNotWithinRangeException,NameNotValidException {
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.course=course;
        if(age<15 || age >21){
            throw new AgeNotWithinRangeException("Age not within range");
        }
        if(!name.matches("^[A-Za-z ]+$")){
            throw new NameNotValidException("Name is not valid");
        }
    }
}
class AgeNotWithinRangeException extends Exception{
    AgeNotWithinRangeException(String s){
        super(s);
    }
}
class NameNotValidException extends Exception{
    NameNotValidException(String s){
        super(s);
    }
}
//Output1:
//Enter Roll no.:
//1
//Enter Name:
//Regin32
//Enter Age:
//17
//Enter Course:
//Java
//Name is not valid
//***********************************
//Output2:
//Enter Roll no.:
//1
//Enter Name:
//Regin
//Enter Age:
//32
//Enter Course:
//Java
//Age not within range