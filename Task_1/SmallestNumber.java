package Task_1;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        int n3 = obj.nextInt();
        if(n1<n2 && n1<n3){
            System.out.println(n1 + " is the smallest number");
        }else if(n2<n1 && n2<n3){
            System.out.println(n2 + " is the smallest number");
        }else{
            System.out.println(n3 + " is the smallest number");
        }
    }
}
