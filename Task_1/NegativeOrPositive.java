package Task_1;

import java.util.Scanner;

public class NegativeOrPositive {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        if(userInput>=0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
