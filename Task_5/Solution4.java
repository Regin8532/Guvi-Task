package Task_5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//4. Rajesh has been given a task to create an app which takes the user's birthdate as input and calculates their age, you have to help him to build this app using the java.time.LocalDate class.
//Input:
//Enter your birthdate (yyyy-mm-dd): 1990-05-15
//Output:
//Your age is: 33 years, 4 months,and 13 days.
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter DOB (yyyy-mm-dd): ");
        String dob = sc.next();
        LocalDate birthDate = LocalDate.parse(dob);
        LocalDate today = LocalDate.now();
        long years = ChronoUnit.YEARS.between(birthDate, today);//full years between birthday and today
        long months = ChronoUnit.MONTHS.between(birthDate.plusYears(years), today);//remaining months after removing full years
        long days = ChronoUnit.DAYS.between(birthDate.plusYears(years).plusMonths(months), today);//remaining days after removing full years and months
        System.out.println("Your age is: "+years+" years, "+months+ " months, and "+days+" days.");

    }
}
//Output:
//Enter DOB (yyyy-mm-dd): 2003-10-24
//Your age is: 22 years, 0 months, and 18 days.