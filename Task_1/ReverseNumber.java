package Task_1;

import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        int reverse=0;
        while(userInput>0){
            int lastDigit=userInput%10;
            reverse=reverse*10 + lastDigit ;
            userInput=userInput/10;
        }
        System.out.println(reverse);
    }
}
