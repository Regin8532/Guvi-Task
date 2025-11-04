package Task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Q4. Create a HashMap where keys are student names (strings) and values are their corresponding grades (integers). Create methods to add a new student, remove a student, and Display up a student's grade by name.
public class Solution4 {
    Map<String,Integer> studDetails = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Solution4 sol =new Solution4();

        while (true){
            System.out.println("1.Add student details");
            System.out.println("2.Remove student details");
            System.out.println("3.Display student details");
            System.out.println("4.Exit.....");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter Student name:");
                    String name=sc.next();
                    System.out.println("Enter the grade:");
                    int grade=sc.nextInt();
                    sol.add(name,grade);
                    System.out.println("Student details added successfully!!");
                    break;
                case 2:
                    System.out.println("Enter Student name:");
                    String removeName=sc.next();
                    sol.remove(removeName);
                    break;
                case 3:
                    System.out.println("Enter Student name:");
                    String dispalyName=sc.next();
                    sol.display(dispalyName);
                    break;
                case 4:
                    System.out.println("Exiting ...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    void add(String name,int grade){
         studDetails.put(name,grade);
    }
    void remove(String name){
        if (studDetails.containsKey(name)) {
            studDetails.remove(name);
            System.out.println("Student details removed...");
        } else {
            System.out.println("Student not found");
        }
    }
    void display(String name){
        if (studDetails.containsKey(name)) {
            System.out.println("Name: " + name + ", Grade: " + studDetails.get(name));
        } else {
            System.out.println("Student not found ");
        }
    }
}
//Output:
//1.Add student details
//2.Remove student details
//3.Display student details
//4.Exit.....
//1
//Enter Student name:
//abc
//Enter the grade:
//98
//Student details added successfully!!
//1.Add student details
//2.Remove student details
//3.Display student details
//4.Exit.....
//1
//Enter Student name:
//def
//Enter the grade:
//99
//Student details added successfully!!
//1.Add student details
//2.Remove student details
//3.Display student details
//4.Exit.....
//2
//Enter Student name:
//abc
//Student details removed...
//1.Add student details
//2.Remove student details
//3.Display student details
//4.Exit.....
//3
//Enter Student name:
//def
//Name: def, Grade: 99
//1.Add student details
//2.Remove student details
//3.Display student details
//4.Exit.....
//4
//Exiting ...