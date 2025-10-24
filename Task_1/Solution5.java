package Task_1;

import java.util.Scanner;

public class Solution5 {
    //5) Write a Java program that takes the purchase amount as input and calculates the final payable amount after applying the discount.
    //
    //1. If the purchase amount is less than 500, no discount is applied.
    //
    //2. If the purchase amount is between 500 and 1000, a 10% discount is applied.
    //
    //3. If the purchase amount is greater than 1000 a 20% discount is applied.
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int purchaseAmount = obj.nextInt();
        billAmount(purchaseAmount);
    }
    //Input1 - 400
    //Output1 - Final Amount Payable:400(No discount applied since the bill amount is below 500)
    //Input2 - 1000
    //Output2 - Final Amount Payable:900(10% discount since the bill is between 500 and 1000)
    //Input3 - 1001
    //Output3 - Final Amount Payable:801(20% discount since the bill amount is above 1000)
    public static void billAmount(int purchaseAmount){
        int finalAmount;
        if(purchaseAmount<=500){
            finalAmount=purchaseAmount;
            System.out.println("Final Amount Payable:" + finalAmount);
        }else if(purchaseAmount>500 && purchaseAmount<=1000){
            finalAmount=purchaseAmount - (purchaseAmount*10)/100;
            System.out.println("Final Amount Payable:" + finalAmount);
        }else{
            finalAmount=purchaseAmount - (purchaseAmount*20)/100;
            System.out.println("Final Amount Payable:" + finalAmount);
        }
    }
}
