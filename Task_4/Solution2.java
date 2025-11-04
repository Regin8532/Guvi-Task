package Task_4;

import java.util.Scanner;
//Q2. Create a class Voter(voterId, name, age) with parameterized constructor. The parameterized constructor should throw a checked/Unchecked exception if age is less than 18. The message of exception is "invalid age for voter"
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter voter ID: ");
        int voterId= sc.nextInt();
        System.out.println("Enter Name: ");
        String name= sc.next();
        System.out.println("Enter age: ");
        int age= sc.nextInt();
        try {
            Voter voter = new Voter(voterId, name, age);
            System.out.println("Eligible to vote");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
class Voter{
    int voterId;
    String name;
    int age;
    Voter(int voterId,String name,int age) throws InvalidAgeException{
        this.voterId=voterId;
        this.name=name;
        this.age=age;
        if(age<18){
            throw new InvalidAgeException("invalid age for vote");
        }
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
//Output1:
//Enter voter ID:
//1
//Enter Name:
//Regin
//Enter age:
//17
//invalid age for vote
//*********************************************
//Output2:
//Enter voter ID:
//1
//Enter Name:
//Regin
//Enter age:
//22
//Eligible to vote