package Task_4;

import java.util.Scanner;
//Q3. Store name of weekdays in an array (starting from "Sunday" at 0 index). Ask day position from user and print day name. Handle array index out of bound exception and give proper message if user enters day index outside range (0-6).
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Enter the day Index: ");
        int index=sc.nextInt();
        try {
            System.out.println(days[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index should be between 0-6.");
        }
    }
}
//Output1:
//Enter the day Index:
//2
//Tuesday
//*************************************
//Output2:
//Enter the day Index:
//8
//Index should be between 0-6.