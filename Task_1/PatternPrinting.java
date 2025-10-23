package Task_1;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
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
