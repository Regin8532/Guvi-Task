package Task_4;

import java.util.Scanner;
import java.util.Stack;
//Q5. Use Collection Classes to store Integers. Create some methods for following functionalities.
//a. Include functions for pushing elements onto the stack.
//b. popping elements from the stack.
//c. checking if the stack is empty.
public class Solution5 {
    Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Solution5 sol =new Solution5();

        while (true){
            System.out.println("1.Push element");
            System.out.println("2.Pop element");
            System.out.println("3.Is stack empty or not?");
            System.out.println("4.Exit.....");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the element to add:");
                    int element=sc.nextInt();
                    sol.pushing(element);
                    break;
                case 2:
                    sol.popping();
                    break;
                case 3:
                    sol.checkingEmpty();
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
    void pushing(int element){
        stack.push(element);
        System.out.println("Element added successfully!!");
    }
    void popping(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty can't pop elements");
        }else{
            stack.pop();
            System.out.println("Element popped successfully!!");
        }
    }
    void checkingEmpty(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Stack is not empty");
        }
    }
}
//Output:
//1.Push element
//2.Pop element
//3.Is stack empty or not?
//4.Exit.....
//1
//Enter the element to add:
//54
//Element added successfully!!
//1.Push element
//2.Pop element
//3.Is stack empty or not?
//4.Exit.....
//1
//Enter the element to add:
//32
//Element added successfully!!
//1.Push element
//2.Pop element
//3.Is stack empty or not?
//4.Exit.....
//1
//Enter the element to add:
//43
//Element added successfully!!
//1.Push element
//2.Pop element
//3.Is stack empty or not?
//4.Exit.....
//2
//Element popped successfully!!
//1.Push element
//2.Pop element
//3.Is stack empty or not?
//4.Exit.....
//2
//Element popped successfully!!
//1.Push element
//2.Pop element
//3.Is stack empty or not?
//4.Exit.....
//3
//Stack is not empty
//1.Push element
//2.Pop element
//3.Is stack empty or not?
//4.Exit.....
//4
//Exiting ...