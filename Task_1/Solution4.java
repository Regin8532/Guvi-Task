package Task_1;

import java.util.Scanner;

public class Solution4 {
    //4)Write a java program to Find the smallest number among three numbers.
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        int n3 = obj.nextInt();
        smallestNumber(n1,n2,n3);
    }

    //Input => 3,4,-1
    //Output => -1 is the smallest number
    public static void smallestNumber(int n1,int n2,int n3){
        if(n1<n2 && n1<n3){
            System.out.println(n1 + " is the smallest number");
        }else if(n2<n1 && n2<n3){
            System.out.println(n2 + " is the smallest number");
        }else{
            System.out.println(n3 + " is the smallest number");
        }
    }
}
