package Task_1;

import java.util.Scanner;

public class Solution2 {
    //2) Write a program that find a given number is negative or positive.
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        negativeOrPositive(n);
    }

    //Input - 8
    //Output - Positive
    public static void negativeOrPositive(int userInput){
        if(userInput>=0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
