package Task_1;

import java.util.Scanner;
//3)Write a program to find the given number is positive or negative
public class Solution3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        reverseNumber(userInput);
    }

    //Input - 876
    //Output - 678
    public static void reverseNumber(int userInput){
        int reverse=0;
        while(userInput>0){
            int lastDigit=userInput%10;
            reverse=reverse*10 + lastDigit ;
            userInput=userInput/10;
        }
        System.out.println(reverse);
    }
}

