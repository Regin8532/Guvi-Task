package Task_1;

import java.util.Scanner;

public class Solution6 {
    //6) Write a java program to print bellowed pattern ->i and j and k=>5
    //
    //55555
    //54444
    //54333
    //54322
    //54321

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        patternPrinting(userInput);
    }

    //Input - 5
    //Output - 55555
    //         54444
    //         54333
    //         54322
    //         54321
    public static void patternPrinting(int userInput){
        for(int i=1;i<=userInput;i++){
            for(int j=1;j<=userInput;j++){
                if(j>=i){
                    System.out.print(userInput-i+1);
                }else{
                    System.out.print(userInput-j+1);
                }
            }
            System.out.println();
        }
    }

}
